package com.onesolvent.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("applicationcontext.xml");
		CoachInterface bean = applicationContext.getBean("mycoach",CoachInterface.class);
		System.out.println(bean.getDailyWorkout());
		applicationContext.close();
		
		//so tomo supose I need to get update on cricket coach then i would simple change the 
		//implementation class in xml file rather hard coding here 

	}

}
