package com.liu.source.aspectJ;

/**
 * Created by liufengfang on 2019/3/17.
 */
public aspect TxAspect {

    void around():call(void sayHello()){
        System.out.println("trans begin");
        proceed();
        System.out.println("trasn end");
    }

}
