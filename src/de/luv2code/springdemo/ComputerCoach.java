package de.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pcCoach")
public class ComputerCoach implements Coach {

	
	private FortuneService fortuneService;
		
	@Autowired
	public ComputerCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkout() {
		return "Check out the new CT!";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}


}
