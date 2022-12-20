package com.onesolvent.springDI;

import com.onesolvent.springDI.service.FotuneService;

public class CricketCoach implements CoachInterface {
	
	private FotuneService fotuneService;
	
	public  CricketCoach(FotuneService fotuneService) {
		this.fotuneService=fotuneService;

	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Daily 1 hour balling practice.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fotuneService.getFortune();
	}

}
