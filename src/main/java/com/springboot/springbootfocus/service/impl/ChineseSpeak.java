package com.springboot.springbootfocus.service.impl;

import com.springboot.springbootfocus.condition.ChineseCondition;
import com.springboot.springbootfocus.condition.SpeakCondition;
import com.springboot.springbootfocus.service.SpeakService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * <dl>
 * <dt> ChineseSpeak</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2018</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2019/3/19</dd>
 * </dl>
 *
 * @author lizhu
 */
@Component
//@Profile("prod")
@Conditional(ChineseCondition.class)
public class ChineseSpeak implements SpeakService {
    @Override
    public String speak() {
        return "中文";
    }
}
