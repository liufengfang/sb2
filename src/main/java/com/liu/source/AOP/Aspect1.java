package com.liu.source.AOP;

import com.liu.annotation.Person;
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
 *
 * @Component注解，切面也生效了。
 */
@Component
@Aspect
public class Aspect1 {
    protected final Log logger = LogFactory.getLog(this.getClass());

//    @Pointcut("within(com.liu.web)")
//    public void inWebLayer() {
//    }

    @Pointcut("execution(* com.liu.source.chap5.*.*(..))")
    public void businessService() {
    }

    @Pointcut("execution(* com.liu.source.service.*.*(..))")
    public void AroundCheck() {
    }

    @Pointcut("execution(* com.liu.source.service.MyService.eatApple(com.liu.annotation.Person)) " +
            "&& args(person)")
    public void eatPointCut(Person person) {
    }


    @Around("execution(* com.liu.source.service.*.*(..))")
    public void doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("aspectJ-Around before!");
        joinPoint.proceed();
        logger.info("aspectJ-Around after!");
    }

    @Before("@annotation(com.liu.source.AOP.MyAnnotation)")
    public void doBefore() {
        logger.info("aspectJ-doBefore --------");
    }

    @Before("eatPointCut(person)")
    public void doBeforeEatApple(Person person) {
        logger.info(person + " wash hands!");
    }
}
