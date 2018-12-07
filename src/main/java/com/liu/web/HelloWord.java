package com.liu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloWord {

    @RequestMapping("/helloWorld")
    String home() {
        return "easy1";
    }

    @RequestMapping(value = "/testGet",method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> requestMappingWithGET() {
        //仅GET请求会进入本方法
        Map<String, String> map = new HashMap<>();
        map.put("method", "requestMappingWithGET");

        return map;
    }
    @RequestMapping(value = "/testGet")
    @ResponseBody
    public Map<String, String> requestMappingWithNothing() {
        //类似兜底的方法，
        // 除明确定义了RequestMethod的请求外，其他请求都会进入本方法
        Map<String, String> map = new HashMap<>();
        map.put("method", "requestMappingWithNothing");

        return map;
    }

    @RequestMapping(value = "/testGet", method = RequestMethod.PUT)
    @ResponseBody
    public Map<String, String> requestMappingWithPUT(){
        //仅PUT请求会进入本方法
        Map<String, String> map = new HashMap<>();
        map.put("method", "requestMappingWithPUT");

        return map;
    }


}