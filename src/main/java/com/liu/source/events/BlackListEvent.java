package com.liu.source.events;

import org.springframework.context.ApplicationEvent;

/**
 * Created by liufengfang on 2019/9/27.
 * 观察者模式：
 * 定义：观察者模式是对象的行为模式，又叫发布-订阅(Publish/Subscribe)模式、
 *      模型-视图(Model/View)模式、源-监听器(Source/Listener)模式或从属者(Dependents)模式。
 * 使用场景：观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 *      这个主题对象在状态上发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
 *
 * 本类可以认为是一个主题对象或事件。
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
