package com.liu.source.chap2;

import com.liu.source.chap5.LffService;

/**
 * Created by liufengfang on 2019/3/17.
 */
public class MyTestBean {
    private String testStr = "testStr";
    private LffService lffService;

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public LffService getLffService() {
        return lffService;
    }

    public void setLffService(LffService lffService) {
        this.lffService = lffService;
    }
}
