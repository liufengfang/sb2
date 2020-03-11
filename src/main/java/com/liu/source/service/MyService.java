package com.liu.source.service;

import com.liu.annotation.Person;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by liufengfang on 2019/9/24.
 */
@Component
public class MyService {
    @Value("#{environment['sb2.placeholder.test.person.name'] }")
    private String name;
    @Value("#{environment['sb2.placeholder.test.person.city'] }")
    private String city;

    protected final Log logger = LogFactory.getLog(this.getClass());


    public void sayHi(){
        logger.info("sayHi");
    }

    public void eatApple(Person person) {
        logger.info(person + " eat an apple!");
    }
}
