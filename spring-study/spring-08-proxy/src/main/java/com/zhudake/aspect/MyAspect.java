package com.zhudake.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Before("execution(* com.zhudake.aspect.Student.put(..))")
    public void before() {
        System.out.println("前置增强");
    }
    @After("execution(* com.zhudake.aspect.Student.put(..))")
    public void after() {
        System.out.println("后置增强");
    }
}
