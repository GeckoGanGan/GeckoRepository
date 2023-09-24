package com.zhudake.demo03;

import com.zhudake.demo02.UserService;
import com.zhudake.demo02.UserServiceImpl;

public class Client {

    public static void main(String[] args) {

/*        Rent rent = new Host();

        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        proxyInvocationHandler.setTarget(rent);

        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();*/

        UserService userService = new UserServiceImpl();

        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        proxyInvocationHandler.setTarget(userService);

        UserService proxy = (UserService) proxyInvocationHandler.getProxy();

        proxy.add();
    }


}
