package com.onesolvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.onesolvent.service.FortuneService;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	private FortuneService fortuneservice;

	//if you dont give the bean id in @Component class then default bean id is generated by spring
	@Autowired
	public TennisCoach(@Qualifier("FOrtuneServiceImpl2") FortuneService fortuneService) {
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