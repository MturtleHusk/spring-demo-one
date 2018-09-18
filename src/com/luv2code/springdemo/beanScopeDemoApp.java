package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml"); 
				
		// retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// retrieve beans from spring container
		Coach baseballCoach_1 = context.getBean("myBaseballCoach", Coach.class);
		Coach baseballCoach_2 = context.getBean("myBaseballCoach", Coach.class);
		
		// Check if these are the same beans (false if singleton)
		boolean result = theCoach == alphaCoach;
		System.out.println("does theCoach and  alphaCoach point to the same object: " + result);
		System.out.println("Mem location for theCoach: " + theCoach);
		System.out.println("Mem location for alphaCoach: " + alphaCoach);
		
		System.out.println("\n------------------");
		
		// Added on my own - not part of lecture
		// Check if these are the same beans (true if singleton), which is the default scope
		result = baseballCoach_1 == baseballCoach_2;
		System.out.println("do both baseball coaches point to the same object: " + result);
		System.out.println("Mem location for baseballCoach_1: " + baseballCoach_1);
		System.out.println("Mem location for baseballCoach_2: " + baseballCoach_2);
		
		
		// close the context	
		//The context is closed and that means the bean is longer being managed by Spring. However, you can still use the bean as a regular Java object.
		context.close();

	}

}
