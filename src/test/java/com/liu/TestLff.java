package com.liu;

import com.liu.annotation.Person;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.util.Assert;
import org.springframework.web.bind.WebDataBinder;

/**
 * Created by liufengfang on 2020/2/28.
 */
public class TestLff {

    @Test
    public void t1() {
        ExtendedModelMap emm = new ExtendedModelMap();
        emm.addAttribute("tom", new Person("tom", "sh"));

        System.err.println("======" + emm.get("tom"));

        WebDataBinder webDataBinder =
                new WebDataBinder(new Person("jim", "bj"), "jim");

        webDataBinder.getValidators();
        System.out.println(String.format("ss=%s", webDataBinder.isIgnoreInvalidFields()));
    }

    @Test
    public void t2() {
        t3(1);
    }

    public void t3(int i) {
        Assert.state(i == 1, "IllegalStateException throwed!");
        System.out.println("proceded aaaa");
    }

}
