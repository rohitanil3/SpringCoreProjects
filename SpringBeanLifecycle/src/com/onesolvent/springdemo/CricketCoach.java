package com.onesolvent.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class CricketCoach implements CoachInterface,DisposableBean {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Daily 1 hour balling practice.";
	}
	
	void initmethod(){
		System.out.println("init method called");
	}
	


	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("disposable beans destroy called"+this);
		
	}

}
