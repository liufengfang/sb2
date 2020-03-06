package com.liu.source.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liufengfang on 2019/9/27.
 *
 * 发布者，触发事件的发生
 */
@Component
public class EmailService implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void sendEmail(String address, String content) {
        //发布，触发事件的发生
        publisher.publishEvent(new BlackListEvent(this, address, content));
    }
}
