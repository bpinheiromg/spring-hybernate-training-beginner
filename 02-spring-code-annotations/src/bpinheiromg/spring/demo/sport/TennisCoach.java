package bpinheiromg.spring.demo.sport;

import org.springframework.stereotype.Component;

@Component("sillyTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley one thousand times.";
	}

}
