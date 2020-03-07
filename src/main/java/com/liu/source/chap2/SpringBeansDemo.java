package com.liu.source.chap2;

import com.liu.annotation.Person;
import com.liu.annotation.conditional.ConditionConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * Created by liufengfang on 2019/3/28.
 */
public class SpringBeansDemo {
    @Test
    public void mmmm() {
//        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-source-test.xml"));
//        MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
//        Assert.assertEquals("haha,I'm myTestBean",myTestBean.getTestStr());

        ApplicationContext ac = new AnnotationConfigApplicationContext(ConditionConfig.class);
        System.err.println(Arrays.toString(ac.getBeanDefinitionNames()));

        /*
        org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        No qualifying bean of type 'com.liu.annotation.Person' available:
        expected single matching bean but found 2: person,person2
        */
//        Person p = ac.getBean(Person.class);


        Person p = ac.getBean("person", Person.class);
        Person p2 = ac.getBean("person2", Person.class);
    }
}
