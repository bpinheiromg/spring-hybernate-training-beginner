package bpinheiromg.spring.demo.sport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import bpinheiromg.spring.demo.fortune.FortuneService;

@Component
public class TennisCoach implements Coach {

	FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("doomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley one thousand times.";
	}
	
	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
