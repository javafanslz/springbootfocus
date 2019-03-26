package com.springboot.springbootfocus.condition;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * <dl>
 * <dt> SpeakCondition</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2018</dd>
 *
 * @ConditionalOnBean（仅仅在当前上下文中存在某个对象时，才会实例化一个Bean）
 * @ConditionalOnClass（某个class位于类路径上，才会实例化一个Bean）
 * @ConditionalOnExpression（当表达式为true的时候，才会实例化一个Bean）
 * @ConditionalOnMissingBean（仅仅在当前上下文中不存在某个对象时，才会实例化一个Bean）
 * @ConditionalOnMissingClass（某个class类路径上不存在的时候，才会实例化一个Bean）
 * @ConditionalOnNotWebApplication（不是web应用）
 *
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2019/3/19</dd>
 * </dl>
 *
 * @author lizhu
 */
public class SpeakCondition implements Condition {

    private static final String DEV = "dev";

    private static final String PROD = "prod";



    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env = conditionContext.getEnvironment();
        if(StringUtils.equalsIgnoreCase(env.getActiveProfiles()[0],DEV)){
            return true;
        }
        return false;
    }
}
