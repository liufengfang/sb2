package com.liu.source.chap5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by liufengfang on 2019/3/28.
 */
public class LffService implements FactoryBean<EntityBean> {
    private static final Logger LOGGER = LoggerFactory.getLogger(LffService.class);


    @Override
    public EntityBean getObject() throws Exception {
        EntityBean eb = new EntityBean();
        LOGGER.debug("impl FactoryBean.getObject()!");
        return eb;
    }

    @Override
    public Class<?> getObjectType() {
        return EntityBean.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
