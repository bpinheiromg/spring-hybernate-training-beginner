package bpinheiromg.spring.demo.fortune;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class DoomFortuneService implements FortuneService {

	String[] fortune = {
			"Something terrible will happen if you go out.",
			"Your job is in danger today.",
			"Avoid people today because your life is at stake."};

	public String getFortune() {
		Random rand = new Random();
		return fortune[rand.nextInt(fortune.length)];
	}

}
