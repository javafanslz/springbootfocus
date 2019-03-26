package com.springboot.springbootfocus.controller;

import com.springboot.springbootfocus.config.HelloOne;
import com.springboot.springbootfocus.config.HelloTwo;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private HelloOne helloOne;

    @Autowired
    private HelloTwo helloTwo;

    @RequestMapping("/hello")
    public String index(){
        return "Gettings from Spring Boot";
    }

    @RequestMapping("/myName")
    public String info(){
        return name+"@@@"+age;
    }

    @RequestMapping("/sayHello")
    public void sayOne(){
        helloOne.printHelloOne();
    }


}
