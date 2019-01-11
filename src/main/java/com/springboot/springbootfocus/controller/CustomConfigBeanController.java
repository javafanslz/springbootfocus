package com.springboot.springbootfocus.controller;

import com.springboot.springbootfocus.config.CustomConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Author: lizhu
 * @ClassName: CustomConfigBeanController
 * @Desciption: Date:2018/12/30
 */
@RestController
@ApiIgnore
public class CustomConfigBeanController {
    @Autowired
    private CustomConfigBean customConfigBean;

    @RequestMapping("/customConfig")
    public String customConfig(){
        return customConfigBean.toString();
    }
}
