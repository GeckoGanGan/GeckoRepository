package com.zhudake.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    //真实角色
    private Object target;

    //调用当前类的时候设置真实角色
    public void setTarget(Object target) {
        this.target = target;
    }

    //生成代理角色
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    //根据真实角色，将真实角色的方法添加到代理角色和扩展真实角色的功能
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }
    //扩展真实角色的功能
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
