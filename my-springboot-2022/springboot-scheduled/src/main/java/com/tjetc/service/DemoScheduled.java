package com.tjetc.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoScheduled {
    @Scheduled(cron = "0/2 * * * * *")//每个两秒执行与一下该方法
    public void TestScheduled(){
        System.out.println("testScheduled");
    }
}
