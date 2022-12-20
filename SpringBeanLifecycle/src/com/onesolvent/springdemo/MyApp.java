package com.onesolvent.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoachInterface theCoach=new BaseballCoach();
		CoachInterface Coach=new CricketCoach();

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(Coach.getDailyWorkout());


	}

}
