package de.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// setting up default constructor
	public TennisCoach() {
		System.out.println("TennisCoach: >> inside default constructor");
	}
	/*
	// setting up setter-injection
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("TennisCoach: >> inside doSomeCrazyStuff-method");
		this.fortuneService = fortuneService;
	}
	*/
	@Override
	public String getWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
