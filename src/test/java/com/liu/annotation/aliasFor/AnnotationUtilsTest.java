package com.liu.annotation.aliasFor;

import com.liu.InterceptorConfig;
import com.liu.Sb2Application;
import org.junit.Test;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.StringUtils;

import java.util.Arrays;

/**
 * Created by liufengfang on 2020/3/12.
 */
@ContextConfiguration(classes = {InterceptorConfig.class, Sb2Application.class})
//@STC(cs = InterceptorConfig.class)
public class AnnotationUtilsTest {

    @Test
    public void testAliasFor(){
        ContextConfiguration cc =
                AnnotationUtils.findAnnotation(this.getClass(), ContextConfiguration.class);
        System.out.println(StringUtils.arrayToCommaDelimitedString(cc.value()));
        System.out.println(Arrays.toString(cc.locations()));
        System.out.println(StringUtils.arrayToCommaDelimitedString(cc.classes()));
    }
}
