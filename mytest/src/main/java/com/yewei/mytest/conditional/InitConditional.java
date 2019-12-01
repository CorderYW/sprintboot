package com.yewei.mytest.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class InitConditional implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //判断是否已经包含了amazonTest Bean
        Boolean bol =  conditionContext.getBeanFactory().containsBean("amazonTest");
        return bol;
    }
}
