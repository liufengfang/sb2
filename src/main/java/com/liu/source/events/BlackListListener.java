package com.liu.source.events;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by liufengfang on 2019/9/27.
 *
 * 监听者，还可认为是订阅者或模型-视图(Model/View)模式中的View。
 */
@Component
public class BlackListListener implements ApplicationListener<BlackListEvent> {
    protected final Log logger = LogFactory.getLog(this.getClass());

    @Override
    public void onApplicationEvent(BlackListEvent blackListEvent) {
        logger.info("BlackListNotifier Handles an BlackListEvent........");
        logger.info(""+blackListEvent.getAddress());
    }
}
