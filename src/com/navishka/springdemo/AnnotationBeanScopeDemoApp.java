package com.navishka.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//Load Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from Spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//Check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same Object: " + result);
		
		System.out.println("\nMemory location for theCoach:" + theCoach);
		System.out.println("\nMemory location for alphaCoach:" + alphaCoach);
		
		//Closing the context
		context.close();

	}

}
