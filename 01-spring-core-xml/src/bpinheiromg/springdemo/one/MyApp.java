package bpinheiromg.springdemo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bpinheiromg.springdemo.one.service.sport.Coach;

public class MyApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach aCoach = context.getBean("myCoach", Coach.class);

		// use the object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		System.out.println("Same Coach? "+(theCoach == aCoach));

		System.out.println("Same Fortune? "+(theCoach.getFortuneBean() == aCoach.getFortuneBean()));

		context.close();
	}

//	public static void main(String[] args) {
//
//		// create the object
//		// Coach theCoach = new BaseballCoach();
//		Coach theCoach = new TrackCoach();
//
//		// use the object
//		System.out.println(theCoach.getDailyWorkout());
//	}

}
