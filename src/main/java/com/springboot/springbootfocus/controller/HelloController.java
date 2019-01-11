package com.springboot.springbootfocus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Author: lizhu
 * @ClassName: HelloController
 * @Desciption: Date:2018/12/28
 */
@RestController
@ApiIgnore
public class HelloController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private String age;
    @RequestMapping("/hello")
    public String index(){
        return "Gettings from Spring Boot";
    }

    @RequestMapping("/myName")
    public String info(){
        return name+"@@@"+age;
    }
}
