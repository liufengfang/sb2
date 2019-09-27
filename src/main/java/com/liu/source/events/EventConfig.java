package com.liu.source.events;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Created by liufengfang on 2019/9/27.
 */
@Configuration
public class EventConfig {
    @Bean
    public EmailService emailService(){
        EmailService es = new EmailService();
        es.setBlackList(Arrays.asList("1@qq.com","2@qq.com"));
        return es;
    }

    @Bean
    public BlackListNotifier blackListNotifier(){
        BlackListNotifier bln = new BlackListNotifier();
//        bln.setNotificationAddress("1@qq.com");
        return bln;
    }
}
