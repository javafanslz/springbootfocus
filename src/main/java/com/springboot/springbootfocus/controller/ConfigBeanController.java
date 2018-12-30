package com.springboot.springbootfocus.controller;

import com.springboot.springbootfocus.config.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lizhu
 * @ClassName: ConfigBeanController
 * @Desciption: Date:2018/12/30
 */
@RestController
public class ConfigBeanController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @RequestMapping("/getValue")
    public String getValue(){
        return name+"@@"+age;
    }

    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/getConfig")
    public String getConfig(){
       return configBean.toString();
    }



}

