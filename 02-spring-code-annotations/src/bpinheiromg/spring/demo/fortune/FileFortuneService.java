package bpinheiromg.spring.demo.fortune;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	

	private List<String> fortuneList;
	
	private Random rand = new Random();

	@PostConstruct
	private void setupFortune() {
		System.out.println("Inital fortune: "+getFortune());		
	}
	
	public String getFortune() {
		fortuneListFromFile();
		return fortuneList.get(rand.nextInt(fortuneList.size()));
	}
	
	private void fortuneListFromFile() {
		if (fortuneList==null) {
			try {
				fortuneList = Files.readAllLines(Paths.get("./resources/fortune.txt"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
//	@Value("${fortune.01}")
//	private String fortune01;
//	
//	@Value("${fortune.02}")
//	private String fortune02;
//	
//	@Value("${fortune.03}")
//	private String fortune03;
//
//	public String getFortune() {
//		if (fortune==null) 
//			fortune = new ArrayList<>(Arrays.asList(fortune01,fortune02,fortune03));
//		
//		return fortune.get(rand.nextInt(fortune.size()));
//	}

}
