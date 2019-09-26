package com.liu.source.AOP;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

/**
 * Created by liufengfang on 2019/9/24.
 * 注意：即使不在Sb2Application.java里面加@EnableAspectJAutoProxy注解，只在这里加上
 * @Component注解，切面也生效了。
 */
@Component
@Aspect
public class Aspect1 {
    protected final Log logger = LogFactory.getLog(this.getClass());

    @Pointcut("within(com.liu.web)")
    public void inWebLayer() {
    }

    @Pointcut("execution(* com.liu.source.chap5.*.*(..))")
    public void businessService() {
    }

    @Pointcut("execution(* com.liu.source.service.*.*(..))")
    public void AroundCheck() {
    }


    @Around("execution(* com.liu.source.service.*.*(..))")
    public void doAround(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("AroundCheck before!");
        joinPoint.proceed();
        logger.info("Around after!");
    }

    @Before("@annotation(com.liu.source.AOP.MyAnnotation)")
    public void doBefore(){
        logger.info("doBefore --------");
    }


}
