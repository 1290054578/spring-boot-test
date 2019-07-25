package com.lonelywolf.boot.common.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-07-19 15:09
 * @Description: http://localhost:8081/swagger-ui.html
 *
 * swagger 文档配置类
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {



    @Bean
    public Docket testApiInfoApi() {
        List<Parameter> operationParameters = new ArrayList<>();

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("中文的测试API")
                .genericModelSubstitutes(DeferredResult.class)
//              .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                //配置的接口
                .paths(or(regex("/data/primary/.*")))
                .build()
                .globalOperationParameters(operationParameters)
                .apiInfo(testApiInfo());
    }

    private ApiInfo testApiInfo() {
        return new ApiInfoBuilder()
                .title("测试结果")
//                .termsOfServiceUrl("https://XXXXXXX/openapi/")
                .description("测试结果实例")
                .version("1.0")
                .build();
    }


    @Bean
    public Docket testApiInfoApi2() {
        List<Parameter> operationParameters = new ArrayList<>();

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("双数据源测试API")
                .genericModelSubstitutes(DeferredResult.class)
//              .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                //配置的接口
                .paths(or(regex("/data/secondary/.*")))
                .build()
                .globalOperationParameters(operationParameters)
                .apiInfo(testApiInfo());
    }

    private ApiInfo testApiInfo2() {
        return new ApiInfoBuilder()
                .title("双数据")
//                .termsOfServiceUrl("https://XXXXXXX/openapi/")
                .description("双数据源示例")
                .version("1.0")
                .build();
    }

    @Bean
    public Docket redisApiInfo() {
        List<Parameter> operationParameters = new ArrayList<>();

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("redis测试API")
                .genericModelSubstitutes(DeferredResult.class)
//              .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                //配置的接口
                .paths(or(regex("/redis/operation/.*")))
                .build()
                .globalOperationParameters(operationParameters)
                .apiInfo(redisInfo());
    }

    private ApiInfo redisInfo() {
        return new ApiInfoBuilder()
                .title("redis测试接口")
//                .termsOfServiceUrl("https://XXXXXXX/openapi/")
                .description("redis测试示例")
                .version("1.0")
                .build();
    }
}
