package com.zhudake.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//CGLIB动态代理
public class MyMethodInterceptor implements MethodInterceptor{
    /**
     * @param target: 代理对象
     * @param method: 被代理方法
     * @param args: 方法入参
     * @param methodProxy: CGLIB方法
     **/


    private Enhancer enhancer =  new Enhancer();

    public Object creteCglibProxyObject(Class<?> clazz){
        //设置父类
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        // 在方法调用前后添加逻辑
        // ...
        System.out.println("CGLIB动态代理前--->"+method.getName());
        Object result = methodProxy.invokeSuper(target, args);
        System.out.println("CGLIB动态代理后--->"+method.getName());
        return result;
    }

}
