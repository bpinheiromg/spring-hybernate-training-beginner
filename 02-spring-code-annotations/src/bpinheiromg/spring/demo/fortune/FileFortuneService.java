package bpinheiromg.spring.demo.fortune;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	@Value("${fortune.01}")
	private String fortune01;
	
	@Value("${fortune.02}")
	private String fortune02;
	
	@Value("${fortune.03}")
	private String fortune03;

	private ArrayList<String> fortune;
	
	private Random rand = new Random();

	public String getFortune() {
		if (fortune==null) 
			fortune = new ArrayList<>(Arrays.asList(fortune01,fortune02,fortune03));
		
		return fortune.get(rand.nextInt(fortune.size()));
	}

}
