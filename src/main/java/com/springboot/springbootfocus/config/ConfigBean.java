package com.springboot.springbootfocus.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: lizhu
 * @ClassName: ConfigBean
 * @Desciption: Date:2018/12/30
 */
@ConfigurationProperties(prefix = "my")
@Component
public class ConfigBean {
    private String name;
    private int age;
    private int number;
    private String uuid;
    private int max;
    private String value;
    private String greeting;
    private List<String> iplist = new ArrayList<>();
    private Map<String,String> mapProp = new HashMap<>();
    private Map<String,String> mapProp2 =  new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public List<String> getIplist() {
        return iplist;
    }

    public void setIplist(List<String> iplist) {
        this.iplist = iplist;
    }

    public Map<String, String> getMapProp() {
        return mapProp;
    }

    public void setMapProp(Map<String, String> mapProp) {
        this.mapProp = mapProp;
    }

    public Map<String, String> getMapProp2() {
        return mapProp2;
    }

    public void setMapProp2(Map<String, String> mapProp2) {
        this.mapProp2 = mapProp2;
    }

    @Override
    public String toString() {
        return "ConfigBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", uuid='" + uuid + '\'' +
                ", max=" + max +
                ", value='" + value + '\'' +
                ", greeting='" + greeting + '\'' +
                '}';
    }
}
