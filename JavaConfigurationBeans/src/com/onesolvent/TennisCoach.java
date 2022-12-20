package com.onesolvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.onesolvent.service.FortuneService;

public class TennisCoach implements Coach {

	private FortuneService fortuneservice;


	public TennisCoach(FortuneService fortuneService) {
		this.fortuneservice = fortuneService;
	}

	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "Daily batting practice!";
	}

	@Override
	public String getFortune() {
		return fortuneservice.getFortune();
	}

}
