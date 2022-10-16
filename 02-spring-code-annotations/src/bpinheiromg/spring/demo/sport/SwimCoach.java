package bpinheiromg.spring.demo.sport;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import bpinheiromg.spring.demo.fortune.FortuneService;

@Component
public class SwimCoach implements Coach {

	FortuneService fortuneService;
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${coach.email}")
	private String coachEmail;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meter on lava for warm up.";
	}

	public String getCoachName() {
		return coachName;
	}

	public String getCoachEmail() {
		return coachEmail;
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
