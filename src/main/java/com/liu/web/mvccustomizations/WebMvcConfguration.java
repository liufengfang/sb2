package com.liu.web.mvccustomizations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by liufengfang on 2020/3/19.
 * 参考文档https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/html/spring-boot-features.html#boot-features-developing-web-applications
 * 7.1节
 * 参考书籍：Spring in action(4th edition) -page=201
 */
public class WebMvcConfguration implements WebApplicationInitializer{
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

    }
}
