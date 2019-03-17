package com.liu.source.aspectJ;

import org.junit.Test;

/**
 * Created by liufengfang on 2019/3/16.
 */
public class HelloAspectJ {
	public void sayHelloAspect(){
		System.out.println("hello aspectJ");
	}

	@Test
	public void mmmm() {
		HelloAspectJ ha = new HelloAspectJ();
		ha.sayHelloAspect();
	}
}
