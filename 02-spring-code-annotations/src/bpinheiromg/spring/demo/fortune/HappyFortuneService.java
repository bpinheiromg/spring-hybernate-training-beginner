package bpinheiromg.spring.demo.fortune;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	String[] fortune = {
			"You are going to have a great day!",
			"Your day is going to be awsome!",
			"Someone will make you verry happy today!"};

	public String getFortune() {
		Random rand = new Random();
		return fortune[rand.nextInt(fortune.length)];
	}

}
