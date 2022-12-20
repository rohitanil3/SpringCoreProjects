package com.onesolvent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("applicationcontext.xml");
		Coach coach = applicationContext.getBean("tennisCoach",Coach.class);//bean id declated in @Component annotn
		Coach coach2 = applicationContext.getBean("hockyCoach",Coach.class);//default bean id
		System.out.println(coach2.getWorkout());
		applicationContext.close();
		
		//so tomo supose I need to get update on cricket coach then i would simple change the 
		//implementation class in xml file rather hard coding here 

	}

}
