package com.onesolvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onesolvent.service.FortuneService;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	private FortuneService fortuneservice;

	//here spring will first scan through component scan that any impln present for Fortuneservice
	//in our case yes 2 impln are exists then which one to be inject and autowired that is the problem
	//error will be-No qualifying bean of type 'com.onesolvent.service.FortuneService' available: expected single matching bean but found 2
	//to solution on this qualifier is used 
	@Autowired
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
