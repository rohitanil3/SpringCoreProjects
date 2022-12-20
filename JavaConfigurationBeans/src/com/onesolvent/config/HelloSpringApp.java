package com.onesolvent.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onesolvent.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach = applicationContext.getBean("getCoachBean",Coach.class);//bean id declated in @Component annotn
		System.out.println(coach.getWorkout());
		System.out.println(coach.getFortune());
		applicationContext.close();
		
		//so tomo supose I need to get update on cricket coach then i would simple change the 
		//implementation class in xml file rather hard coding here 

	}

}
