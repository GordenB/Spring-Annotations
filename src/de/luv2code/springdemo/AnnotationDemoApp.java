package de.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// load the configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve a bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alpaCoach = context.getBean("pcCoach", Coach.class);
		// call a method from bean
		System.out.println(theCoach.getWorkout());
		System.out.println(alpaCoach.getWorkout());
		System.out.println(alpaCoach.getFortune());
		System.out.println(theCoach.getFortune());
		// close context
		context.close();
	}

}
