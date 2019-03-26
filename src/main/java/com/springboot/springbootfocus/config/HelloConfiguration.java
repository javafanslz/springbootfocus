package com.springboot.springbootfocus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <dl>
 * <dt> HelloConfiguration</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2018</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2019/3/19</dd>
 * </dl>
 *
 * @author lizhu
 */
@Configuration
public class HelloConfiguration {

    @Bean
    public HelloOne getHelloOne(){
        return new HelloOne();
    }

    @Bean
    public HelloTwo getHelloTwo(){
        return new HelloTwo();
    }

}
