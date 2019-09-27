package com.liu.source.events;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;

/**
 * Created by liufengfang on 2019/9/27.
 */
public class BlackListNotifier implements ApplicationListener<BlackListEvent> {
    protected final Log logger = LogFactory.getLog(this.getClass());

//    private String notificationAddress;
//
//    public void setNotificationAddress(String notificationAddress) {
//        this.notificationAddress = notificationAddress;
//    }

    @Override
    public void onApplicationEvent(BlackListEvent blackListEvent) {
        logger.info("BlackListNotifier is listening........");
//        logger.info("notificationAddress=" + notificationAddress);
        logger.info(""+blackListEvent.getAddress());
    }
}
