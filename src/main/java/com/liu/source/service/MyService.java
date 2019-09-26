package com.liu.source.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * Created by liufengfang on 2019/9/24.
 */
@Component
public class MyService {
    protected final Log logger = LogFactory.getLog(this.getClass());


    public void sayHi(){
        logger.info("sayHi");
    }
}