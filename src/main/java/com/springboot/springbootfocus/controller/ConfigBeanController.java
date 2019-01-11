package com.springboot.springbootfocus.controller;

import com.springboot.springbootfocus.config.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: lizhu
 * @ClassName: ConfigBeanController
 * @Desciption: Date:2018/12/30
 */
@RestController
@ApiIgnore
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


    @RequestMapping("/listInfo")
    public String getListInfo(){
        List<String> list = configBean.getIplist();
        StringBuilder builder = new StringBuilder();
        for (String ip:list) {
            builder.append(ip).append("@@");
        }
        return builder.toString();
    }

    @RequestMapping("/mapInfo")
    public String getMapInfo(){
        Map<String, String> map = configBean.getMapProp2();
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        StringBuilder builder = new StringBuilder();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            builder.append(entry.getKey()).append("@@").append(entry.getValue());
            builder.append("#");
        }
        return builder.toString();
    }


}

