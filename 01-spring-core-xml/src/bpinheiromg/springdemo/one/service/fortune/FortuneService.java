package bpinheiromg.springdemo.one.service.fortune;

import java.util.Random;

public class FortuneService {

	String[] fortune = {
			"You are going to have a great day!",
			"Your day is going to be awsome!",
			"Someone will make you varry happy today!"};


	public String getFortune() {
		Random rand = new Random();
		return fortune[rand.nextInt(fortune.length)];
	}

}
