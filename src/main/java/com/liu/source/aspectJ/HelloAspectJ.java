package com.liu.source.aspectJ;

import com.liu.source.chap2.MyTestBean;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by liufengfang on 2019/3/16.
 */
public class HelloAspectJ {
	public void sayHelloAspect(){
		System.out.println("hello aspectJ");
	}

	@Test
	public void mmmm() {
//		HelloAspectJ ha = new HelloAspectJ();
//		ha.sayHelloAspect();
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-source-test.xml"));
		MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
		Assert.assertEquals("testStr",myTestBean.getTestStr());
	}
}
