package com.liu.web;

import com.liu.accessingdatajpa.CustomerRepository;
import com.liu.annotation.Person;
import com.liu.source.AOP.MyAnnotation;
import com.liu.source.events.EmailService;
import com.liu.source.service.MyService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloWorldController {
    protected final Log logger = LogFactory.getLog(this.getClass());


    @Autowired
    private MyService myService;
    @Autowired
    private EmailService emailService;
    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping("/helloWorld")
    String home() {
        myService.sayHi();
        return "easy1";
    }

    @RequestMapping("/demoOfJPA")
    @ResponseBody
    String demoOfJPA(){
        return customerRepository.findById(1L).getFirstName();
    }

    @RequestMapping(value = "/testGet", method = RequestMethod.GET)
    @ResponseBody
    @MyAnnotation
    public Map<String, String> requestMappingWithGET(Person person) {
        //仅GET请求会进入本方法
        Map<String, String> map = new HashMap<>();
        map.put("method", "requestMappingWithGET");
        map.put("person", person.toString());

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
    public Map<String, String> requestMappingWithPUT() {
        //仅PUT请求会进入本方法
        Map<String, String> map = new HashMap<>();
        map.put("method", "requestMappingWithPUT");

        return map;
    }

    @GetMapping("/testEvents")
    @ResponseBody
    public String testEvents() {
        emailService.sendEmail("2@qq.com", "no qq");
        return "testEvents";
    }

    @GetMapping("/eatApple")
    @ResponseBody
    public boolean eatApple(Person person) {
        myService.eatApple(person);
        return true;
    }

}