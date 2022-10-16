package bpinheiromg.spring.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import bpinheiromg.spring.demo.fortune.DoomFortuneService;
import bpinheiromg.spring.demo.fortune.FortuneService;
import bpinheiromg.spring.demo.sport.Coach;
import bpinheiromg.spring.demo.sport.SwimCoach;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfigManualJavaInjection {
	
	@Bean
	public FortuneService randomDoomFortuneService() {
		return new DoomFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(randomDoomFortuneService());
	}

}
