package com.onesolvent;

import org.springframework.stereotype.Component;

@Component
public class HockyCoach implements Coach{

	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "Daily defence practice!";
	}

}
