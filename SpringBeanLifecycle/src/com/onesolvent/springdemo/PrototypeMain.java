package com.onesolvent.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("applicationcontext.xml");
		CoachInterface bean = applicationContext.getBean("mycoach",CoachInterface.class);
		CoachInterface bean2 = applicationContext.getBean("mycoach",CoachInterface.class);
		boolean res=bean==bean2;
		System.out.println("prototype Scope obj "+res);

		System.out.println(bean.getDailyWorkout());
		applicationContext.close();
	}

}
