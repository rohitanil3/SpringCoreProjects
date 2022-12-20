package com.onesolvent.springDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("applicationcontext.xml");
		CoachInterface baseballbean = applicationContext.getBean("mybasecoach",CoachInterface.class);
		System.out.println(baseballbean.getDailyWorkout());
		System.out.println(baseballbean.getDailyFortune());
		
		CoachInterface cricbean = applicationContext.getBean("mycoach",CoachInterface.class);
		System.out.println(cricbean.getDailyWorkout());
		System.out.println(cricbean.getDailyFortune());
		applicationContext.close();
		
		//so tomo supose I need to get update on cricket coach then i would simple change the 
		//implementation class in xml file rather hard coding here 

	}

}
