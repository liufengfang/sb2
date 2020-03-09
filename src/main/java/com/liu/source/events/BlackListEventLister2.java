package com.liu.source.events;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by liufengfang on 2020/3/9.
 */
@Component
public class BlackListEventLister2 implements ApplicationListener<BlackListEvent> {
    protected final Log logger = LogFactory.getLog(this.getClass());


    @Override
    public void onApplicationEvent(BlackListEvent event) {
        logger.debug("-------------BlackListEventLister2");
    }
}
