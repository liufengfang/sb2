package com.liu.source.AOP;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liufengfang on 2019/9/26.
 * 添加参考资料 （SpringBoot 过滤器, 拦截器, 监听器 对比及使用场景）https://www.cnblogs.com/feng9exe/p/11217340.html
 */
public class MyInterceptor implements HandlerInterceptor {
    protected final Log logger = LogFactory.getLog(this.getClass());


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.debug("MyInterceptor-preHandle==========");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.debug("MyInterceptor-postHandle==========");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.debug("MyInterceptor-afterCompletion==========");
    }
}
