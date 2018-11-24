package com.liu.web;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWord {

    @RequestMapping("/helloWorld")
    String home() {
        return "easy1";
    }

//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(HelloWord.class, args);
//    }
}