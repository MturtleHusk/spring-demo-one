package com.luv2code.springdemo;

// MAIN PROGRAM
public class MyApp {

	public static void main(String[] args) {
		// create the object
		// Coach - the interface - has
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
		

	}
	

}
