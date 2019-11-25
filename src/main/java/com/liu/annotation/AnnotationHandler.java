package com.liu.annotation;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by liufengfang on 2019/11/25.
 */
public class AnnotationHandler {

    @Test
    public void check() throws IllegalArgumentException, ReflectiveOperationException {
        Person person  = new Person("lucy","Shanghai");
        // 遍历所有Field:
        for (Field field : person.getClass().getFields()) {
            // 获取Field定义的@Range:
            Range range = field.getAnnotation(Range.class);
            // 如果@Range存在:
            if (range != null) {
                // 获取Field的值:
                Object value = field.get(person);
                // 如果值是String:
                if (value instanceof String) {
                    String s = (String) value;
                    // 判断值是否满足@Range的min/max:
                    if (s.length() < range.min() || s.length() > range.max()) {
                        throw new IllegalArgumentException("Invalid field: " + field.getName());
                    }
                }
            }
        }
    }
}
