package com.onesolvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onesolvent.service.FortuneService;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	private FortuneService fortuneservice;

	
	public TennisCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("default tenniscoach constructor");
		
	}
	
	public FortuneService getFortuneservice() {
		return fortuneservice;
	}

	@Autowired
	public void doservice(FortuneService fortuneservice) {
		System.out.println("method injection through annotation");
		this.fortuneservice = fortuneservice;
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
