package de.luv2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BadAssFortuneService implements FortuneService {

	// String array for fortunes
	@Value("${1}")
	private String[] data;
	
	Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick up element from array
		int index = myRandom.nextInt(data.length);
		String myFortune = data[index];
		return myFortune;
	}

}
