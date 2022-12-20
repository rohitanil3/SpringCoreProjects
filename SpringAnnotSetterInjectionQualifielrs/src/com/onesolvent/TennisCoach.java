package com.onesolvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.onesolvent.service.FortuneService;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	private FortuneService fortuneservice;


	
	public FortuneService getFortuneservice() {
		return fortuneservice;
	}

	@Autowired
	public void doMethodInjection(@Qualifier("fortuneServiceImpl2") FortuneService fortuneservice) {
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
