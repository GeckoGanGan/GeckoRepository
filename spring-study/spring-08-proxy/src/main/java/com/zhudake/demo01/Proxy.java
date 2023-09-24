package com.zhudake.demo01;

public class Proxy implements Rent{
    private Host host;
    @Override
    public void rent() {
        host.rent();
        this.showHose();
        this.sign();
    }
    public void showHose(){
        System.out.println("中介带你看房");
    }
    public void sign(){
        System.out.println("中介带你签合同");
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }
}
