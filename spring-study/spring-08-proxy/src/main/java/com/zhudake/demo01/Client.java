package com.zhudake.demo01;

public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();

        //中介代理房东租房
        Proxy proxy = new Proxy(host);
        proxy.rent();

    }
}
