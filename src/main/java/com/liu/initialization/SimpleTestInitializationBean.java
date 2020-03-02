package com.liu.initialization;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by liufengfang on 2020/3/2.
 */
@Component
public class SimpleTestInitializationBean implements BeanNameAware,ApplicationContextAware{
    @Override
    public void setBeanName(String s) {
        System.err.println("SimpleTestInitializationBean.setBeanName(),====" + s);
        System.err.println("BeanFactoryUtils.originalBeanName,===="
                + BeanFactoryUtils.originalBeanName(s));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.err.println("setApplicationContext-----" + applicationContext.getBean("simpleTestInitializationBean").getClass().getSimpleName());
    }
}
