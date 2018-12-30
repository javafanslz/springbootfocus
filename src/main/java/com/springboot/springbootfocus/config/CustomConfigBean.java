package com.springboot.springbootfocus.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: lizhu
 * @ClassName: CustomConfigBean
 * @Desciption: Date:2018/12/30
 */
@Configuration
@PropertySource(value = "classpath:custom.properties")
@ConfigurationProperties(prefix = "com.company")
public class CustomConfigBean {
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "CustomConfigBean{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
