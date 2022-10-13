package bpinheiromg.springdemo.one.service.sport;

import bpinheiromg.springdemo.one.service.fortune.FortuneService;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public FortuneService getFortuneBean() {
		return fortuneService;
	}

}








