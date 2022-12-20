package com.onesolvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.onesolvent.service.FortuneService;

public class TennisCoach implements Coach {

	private FortuneService fortuneservice;

	@Value("${email}")
	private String email;
	
	@Value("${team}")
	private String team;

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
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
