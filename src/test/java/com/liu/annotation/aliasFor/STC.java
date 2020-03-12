package com.liu.annotation.aliasFor;

import org.springframework.core.annotation.AliasFor;
import org.springframework.test.context.ContextConfiguration;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by liufengfang on 2020/3/12.
 */
@Retention(RetentionPolicy.RUNTIME)
@ContextConfiguration
public @interface STC {
    @AliasFor(value = "classes", annotation = ContextConfiguration.class)
    Class<?>[] cs() default {};
}
