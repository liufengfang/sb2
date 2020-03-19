package com.liu;

import com.liu.annotation.Person;
import com.liu.source.AOP.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by liufengfang on 2019/9/26.
 * 非常重要的接口：WebMvcConfigurer和WebApplicationInitializer
 */
@Profile("dev")
@Configuration
//@PropertySource("classpath:application.yml")  //注释掉这行，发现application.yml也没被加载了
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private Environment env;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
    }

    @Bean
    public Person person3() {
        Person p = new Person(
                env.getProperty("spring.application.name"), "kkk");
        return p;
    }

    //todo 使用@Value("${sb2.placeholder.test.person.name }") 启动报错
    @Bean
    public Person person4(@Value("#{environment['sb2.placeholder.test.person.name'] }") String mname,
                         @Value("#{person3.city }")String mcity){
        return new Person(mname,mcity);
    }
}
