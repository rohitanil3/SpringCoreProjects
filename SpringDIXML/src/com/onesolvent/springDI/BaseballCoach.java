package com.onesolvent.springDI;

import com.onesolvent.springDI.service.FotuneService;

public class BaseballCoach implements CoachInterface {
	
	private FotuneService fservice;
	
	public BaseballCoach(FotuneService fs) {
		fservice=fs;	
}
	
	@Override
	public String getDailyWorkout(){
		return "spend 30 min in practice.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fservice.getFortune();
	}

}
