package com.tjetc.service;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class MyTask extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        //  这里写调用执行定时调度任务的逻辑
        System.out.println("my first job is executing "+new Random().nextInt());
    }

}
