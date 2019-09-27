package com.liu.source.events;

import org.springframework.context.ApplicationEvent;

/**
 * Created by liufengfang on 2019/9/27.
 */
public class BlackListEvent extends ApplicationEvent {
    private final String address;
    private final String content;

    public BlackListEvent(Object source, String address, String content) {
        super(source);
        this.address = address;
        this.content = content;
    }

    public String getAddress() {
        return address;
    }
}
