package com.powerich.schedule;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


@Configuration
@EnableScheduling
public class ScheduleTaskConfig {

	@Scheduled(cron="* 0/30 * * * ?")//每30分执行一次
	public void scheduler() {
		System.out.println(">>>>>>>>>>>>>>Scheduler.scheduler()");
	}
}
