package com.luv2code.springdemo;
// imported for ClassPathXmlApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean(/*bean id - same name from applcationContext.xml*/ "myCoach", /*interface*/ Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context	
		//The context is closed and that means the bean is longer being managed by Spring. However, you can still use the bean as a regular Java object.
		context.close();
	}

}
