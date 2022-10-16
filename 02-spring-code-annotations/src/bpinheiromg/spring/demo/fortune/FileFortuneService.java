package bpinheiromg.spring.demo.fortune;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
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
				fortuneList = new ArrayList<>(Arrays.asList("No luck for you today."));
				System.err.println("Error retriving fortune file : "+e.getMessage());
			}
		}
	}
}
