package com.liu.annotation.conditional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by liufengfang on 2019/11/25.
 */
public class MacCondition implements Condition {
    protected final Log logger = LogFactory.getLog(this.getClass());

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        BeanDefinitionRegistry bdr = conditionContext.getRegistry();
        logger.info("bdr.getBeanDefinitionNames()=" + bdr.getBeanDefinitionNames());

        Environment environment = conditionContext.getEnvironment();

        String property = environment.getProperty("os.name");
        logger.info("os.name=" + property);
        if (property.contains("Mac OS X")) {
            return true;
        }
        return false;

    }
}
