package com.springboot.springbootfocus.autoconfig;

import com.springboot.springbootfocus.annotation.CasFilterSelecter;
import com.springboot.springbootfocus.config.HelloConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * <dl>
 * <dt> EnableCasFilterConfig</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2018</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2019/3/19</dd>
 * </dl>
 *
 * @author lizhu
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
//@Import(CasFilterSelecter.class)
@Import(HelloConfiguration.class)
public @interface EnableCasFilterConfig {

}
