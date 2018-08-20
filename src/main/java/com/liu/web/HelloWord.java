package com.liu.web;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWord {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World! java -jar target/sb2-0.0.1-SNAPSHOT.jar ";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWord.class, args);
    }
}