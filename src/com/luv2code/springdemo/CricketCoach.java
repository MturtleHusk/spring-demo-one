package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	// define private field for the dependency
	private FortuneService fortuneService;	
	
	public CricketCoach() {
		System.out.println("insid cricket no-arg constructor ");
	}
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice your throw boio";
	}

	@Override
	public String getDailyFortune() {	
		return fortuneService.getFortune();
	}

}
