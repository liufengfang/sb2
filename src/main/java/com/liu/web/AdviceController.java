package com.liu.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liufengfang on 2020/2/6.
 */
@ControllerAdvice
public class AdviceController {
    protected final Log logger = LogFactory.getLog(AdviceController.class);

    //1.全局异常处理
    @ExceptionHandler(Exception.class)
    public ModelAndView customExcetion(Exception e) {
        logger.info("Move into ControllerAdvice method!");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", e.getMessage());
        mv.setViewName("easy2");
        return mv;
    }

    //以下也是可以如ModelAndView customExcetion(Exception e)一样效果，但是这两个方法不能并存（启动报错）。
//    @ExceptionHandler(Exception.class)
//    public String customExcetion2(Exception e) {
//        logger.info("Move into ControllerAdvice method!");
//        return "easy2";
//    }

    //全局数据绑定
    @ModelAttribute(name = "dataBind")
    public Map<String, String> dataBind() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "chenguanxi");
        map.put("age", "99");
        map.put("gender", "男");
        return map;
    }

    //全局数据预处理
    @InitBinder("b")
    public void dataPreprocessing(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("b.");
    }

    @InitBinder("a")
    public void dataPreprocessing2(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("a.");
    }

}
