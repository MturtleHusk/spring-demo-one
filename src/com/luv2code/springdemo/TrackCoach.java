package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	// define private field for the dependency
	private FortuneService fortuneService;
	
	// empty constructor - just for now - unused but resolved error
	public TrackCoach() {}
		
	// define a constructor for dependency injection
	public TrackCoach(FortuneService thefortuneService ) {
		fortuneService = thefortuneService;	
	}

	@Override
	public String getDailyWorkout() {		
		return "run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "your bound to do great!";
	}
	
	//add init method
	public void doMyStartupStuff() {
		System.out.println("trackcoach inside doMyStartupStuff()");
	}
	// add destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("trackcoach inside doMyCleanupStuffYoYo()");
	}

}
