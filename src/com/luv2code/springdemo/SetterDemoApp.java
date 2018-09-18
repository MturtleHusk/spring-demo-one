package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCricketCoach",  Coach.class); 
		
		// call methods on the bean		
		System.out.println(theCoach.getDailyWorkout());
		
		// calling our methods for fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the context	
		//The context is closed and that means the bean is longer being managed by Spring. However, you can still use the bean as a regular Java object.
		context.close();

	}
}
