package com.commenclass.Demo04;

public class Mouse implements Usb {
    @Override
    public void service() {
        System.out.println("连接电脑成功，鼠标开始工作！");
    }
}
