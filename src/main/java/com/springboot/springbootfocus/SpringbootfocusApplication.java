package com.springboot.springbootfocus;

import com.springboot.springbootfocus.autoconfig.EnableCasFilterConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCasFilterConfig
@EnableAutoConfiguration
public class SpringbootfocusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootfocusApplication.class, args);
    }

}

