package com.lonelywolf.boot.common.datasource;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-07-23 15:22
 * @Description:
 */
@Configuration
/*** MapperScan扫描mapper文件位置 */
@MapperScan(basePackages = "com/lonelywolf/boot/linuxdatasource/mydemo/mapper", sqlSessionFactoryRef =  "primarySqlSessionFactory")
public class PrimaryDatasourceConfig {

    /*** 数据源注入名称 */
    @Bean(name = "primaryDataSource")
    /*** yml配置的数据源*/
    @ConfigurationProperties(prefix = "datasource.primary")
    /*** @Primary注解标识默认使用的数据源 */
    @Primary
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "primarySqlSessionFactory")
    @Primary
    public SqlSessionFactory primarySqlSessionFactory(@Qualifier("primaryDataSource") DataSource dataSource) throws Exception {
        //使用MybatisSqlSessionFactoryBean，mybatis puls自带的basemapper才能使用
        MybatisSqlSessionFactoryBean bean = new MybatisSqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //读取mybatis xml文件位置
        bean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:com/lonelywolf/boot/linuxdatasource/mydemo/mapper/xml/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "primaryTransactionManager")
    @Primary
    public DataSourceTransactionManager primaryTransactionManager(@Qualifier("primaryDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "primarySqlSessionTemplate")
    @Primary
    public SqlSessionTemplate primarySqlSessionTemplate(@Qualifier("primarySqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}