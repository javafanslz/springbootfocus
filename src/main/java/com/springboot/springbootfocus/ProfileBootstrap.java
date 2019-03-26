package com.springboot.springbootfocus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <dl>
 * <dt> ProfileBootstrap</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2018</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2019/3/19</dd>
 * </dl>
 *
 * @author lizhu
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.springbootfocus")
public class ProfileBootstrap {
    public static void main(String[] args){
        SpringApplication.run(ProfileBootstrap.class);
    }

}
