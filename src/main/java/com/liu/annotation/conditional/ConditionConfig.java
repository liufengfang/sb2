package com.liu.annotation.conditional;

import com.liu.annotation.Person;
import com.liu.source.chap2.MyTestBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
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
    public Person person() {
        logger.info("loading Person");
        return new Person("Mark", "NewYork");
    }

    @ConditionalOnBean(name = "person")
    @ConditionalOnClass(MyTestBean.class)
    @Bean
    public Person person2() {
        logger.info("test ConditionalOnBean");
        return new Person("exists", "person");
    }
}
