package bpinheiromg.springdemo.one.service.sport;

import bpinheiromg.springdemo.one.service.fortune.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
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










