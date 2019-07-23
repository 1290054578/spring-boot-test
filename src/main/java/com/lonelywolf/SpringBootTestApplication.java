package com.lonelywolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * [description]
 * @author xiangyong.zeng
 * @return
 * @date 2019-07-23 15:40
 *
 * ------
 *  单数据源时，需要指定mapper位置否则无法检索到位置
 *  这个工程现配置双数据源，单个数据源中有配置，这里不配
 *  @MapperScan(basePackages = {"com.lonelywolf.boot.linuxdatasource.mydemo.mapper"})
 * ------
 */

@SpringBootApplication
public class SpringBootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestApplication.class, args);
    }

}
