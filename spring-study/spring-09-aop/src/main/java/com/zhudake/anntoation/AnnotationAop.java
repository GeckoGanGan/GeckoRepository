package com.zhudake.anntoation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AnnotationAop {

    @Before("execution(* com.zhudake.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("------方法执行前-------");
    }
    @After("execution(* com.zhudake.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("-------方法执行后--------");
    }

    @Around("execution(* com.zhudake.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕前");
        System.out.println(point.getSignature());
        //执行方法
        Object proceed = point.proceed();
        System.out.println("环绕执行后");
    }
}
