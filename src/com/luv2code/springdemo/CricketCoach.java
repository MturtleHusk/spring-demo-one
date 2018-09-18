package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	// adding private fields
	private String emailAddress;
	private String team;	
	

	
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
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("inside setter of email");
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	

	public void setTeam(String team) {
		System.out.println("inside setter of team");
		System.out.println("inside setter method");
		this.team = team;
	}
	
	public String getTeam() {
		return team;
	}
	
	


}
