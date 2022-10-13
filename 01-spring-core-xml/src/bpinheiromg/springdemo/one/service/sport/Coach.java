package bpinheiromg.springdemo.one.service.sport;

import bpinheiromg.springdemo.one.service.fortune.FortuneService;

public interface Coach {

	public String getDailyWorkout();
	public String getDailyFortune();
	public FortuneService getFortuneBean();

}
