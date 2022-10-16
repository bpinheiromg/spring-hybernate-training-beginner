package bpinheiromg.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bpinheiromg.spring.demo.config.SportConfigManualJavaInjection;
import bpinheiromg.spring.demo.sport.SwimCoach;

public class MyAppManualJavaInjection {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfigManualJavaInjection.class);

		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());		
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getCoachName());		
		System.out.println(theCoach.getCoachEmail());

		context.close();

	}

}
