package com.liu.source.chap2;

import com.liu.source.chap5.EntityBean;

/**
 * Created by liufengfang on 2019/3/17.
 */
public class MyTestBean {
    private String testStr = "testStr";
    private EntityBean lffService;

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public EntityBean getLffService() {
        return lffService;
    }

    public void setLffService(EntityBean lffService) {
        this.lffService = lffService;
    }
}
