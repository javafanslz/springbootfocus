package com.springboot.springbootfocus.service.impl;

import com.springboot.springbootfocus.condition.ChineseCondition;
import com.springboot.springbootfocus.condition.SpeakCondition;
import com.springboot.springbootfocus.service.SpeakService;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * <dl>
 * <dt> EnglishSpeak</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2018</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2019/3/19</dd>
 * </dl>
 *
 * @author lizhu
 */
@Component
//@Profile("dev")
@Conditional(SpeakCondition.class)
public class EnglishSpeak implements SpeakService {
    @Override
    public String speak() {
        return "English";
    }
}
