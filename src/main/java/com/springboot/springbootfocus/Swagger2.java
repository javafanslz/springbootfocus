package com.springboot.springbootfocus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <dl>
 * <dt> Swagger2</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2018</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2019/1/11</dd>
 * </dl>
 *
 * @author lizhu
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createApiDoc(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.apiInfo(apiInfo());
        docket.select()
                .apis(RequestHandlerSelectors.basePackage("com.springboot.springbootfocus.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

    private ApiInfo apiInfo(){
        ApiInfoBuilder builder = new ApiInfoBuilder();
        builder.title("springboot focus 使用swagger2构建Restful api");
        builder.description("https://github.com/javafanslz/springbootfocus");
        builder.termsOfServiceUrl("https://github.com/javafanslz/springbootfocus/blob/master/README.md");
        builder.contact(new Contact("javafanslz","",""));
        builder.version("1.0.RELEASE");
        return builder.build();

    }
}
