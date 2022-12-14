package bpinheiromg.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bpinheiromg.spring.demo.sport.Coach;

public class MyAppXmlConfig {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getFortune());
		
		context.close();
		
	}

}
