package com.liu.annotation.conditional;

import com.liu.annotation.Person;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liufengfang on 2019/11/25.
 */
@Configuration
public class ConditionConfig {
    protected final Log logger = LogFactory.getLog(this.getClass());

    @Conditional(MacCondition.class)
    @Bean
    public Person person(){
        logger.info("loading Person");
        return new Person("Mark", "NewYork");
    }
}
