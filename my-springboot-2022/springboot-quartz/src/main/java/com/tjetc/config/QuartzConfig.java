package com.tjetc.config;

import com.tjetc.service.MyTask;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
    // 定义要执行的MyTask任务类

    /*
     * withIdentity("myfirstjob"):set job name
     * storeDurably():Whether or not the job should remain stored after it is orphaned (no s point to it).
     *
     * @return
     */
    @Bean
    public JobDetail myJobDetail() {
        return JobBuilder.newJob(MyTask.class).withIdentity("myfirstjob").storeDurably().build();
    }

    // Cron触发器定义与设置
    @Bean
    public CronTrigger sayHelloByCronTrigger(){
        // Cron类型：通过cron表达式设置触发规则
        /*
         * withMisfireHandlingInstructionDoNothing：所有的misfire（不起作用）不管，执行下一个周期的任务
         */
        CronScheduleBuilder csb = CronScheduleBuilder.cronSchedule("0/2 * * * * ?")
                .withMisfireHandlingInstructionDoNothing();
        // 一个Trigger只对应一个Job，Schedule调度器调度Trigger执行对应的Job
        CronTrigger cTrigger = TriggerBuilder.newTrigger().forJob(myJobDetail()).
                withIdentity("helloCronTrigger").withDescription("corn类型的触发器").withSchedule(csb).startNow().build();
        return cTrigger;
    }


}
