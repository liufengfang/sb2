package com.liu.source.chap2;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by liufengfang on 2019/3/28.
 */
public class SpringBeansDemo {
    @Test
    public void mmmm() {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-source-test.xml"));
        MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
        Assert.assertEquals("haha,I'm myTestBean",myTestBean.getTestStr());
    }
}
