package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	// define private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService thefortuneService ) {
		fortuneService = thefortuneService;	
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 min on bat practice";
	}

	@Override
	public String getDailyFortune() {
		//use my fortune service to get a fortune
		return fortuneService.getFortune();
	}

}
