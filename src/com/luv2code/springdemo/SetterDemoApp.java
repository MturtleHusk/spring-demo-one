package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
				
		// retrieve bean from spring container		
		CricketCoach theCoach = context.getBean("myCricketCoach",  CricketCoach.class); 
		/*we could of also used Coach.class as the second arg, 
		 * but if we make any new functions specific to CricketCoach class 
		 * something not stated in Coach interface, then youll have to call the 
		 * CricketCaoch.class to access that specific functions
		 * 
		 * if we use CricketCaoch.class when it has additional methods not in Coach.class
		 * you will also have to change theCoach to a type CricketCoach instead of just Coach
		 * because Coach cannot access the get email/team from*/
		
		// call methods on the bean		
		System.out.println(theCoach.getDailyWorkout());
		
		// calling our methods for fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call new methos to get the literals
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());	
		
		
		// close the context	
		//The context is closed and that means the bean is longer being managed by Spring. However, you can still use the bean as a regular Java object.
		context.close();

	}
}
