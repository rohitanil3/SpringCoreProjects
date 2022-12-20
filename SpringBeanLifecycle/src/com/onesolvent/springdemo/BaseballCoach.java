package com.onesolvent.springdemo;

public class BaseballCoach implements CoachInterface {
	
	@Override
	public String getDailyWorkout(){
		return "spend 30 min in practice.";
	}

}
