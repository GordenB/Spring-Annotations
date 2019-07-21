package de.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// array of Strings
	private String[] data = {
			"Nachts ist es kälter als draußen", 
			"Montags ist kein schöner Tag",
			"Die Sonne geht im Osten auf und im Norden unter"};
	Random random = new Random();
	@Override
	public String getFortune() {
		// pick up an element of array
		int index = random.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
