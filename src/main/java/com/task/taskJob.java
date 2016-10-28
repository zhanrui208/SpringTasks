package com.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class taskJob {
	@Scheduled(cron = "0/2 * * * * ?")  
    public void job1() {  
        System.out.println("任务进行中。。。");  
    }  
}
