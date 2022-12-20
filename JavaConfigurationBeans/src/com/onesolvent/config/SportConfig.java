package com.onesolvent.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.onesolvent.Coach;
import com.onesolvent.TennisCoach;
import com.onesolvent.service.FortuneService;
import com.onesolvent.service.FortuneServiceImpl;

@Configuration
@PropertySource("classpath:myprop.properties")
public class SportConfig {
	
	
	@Bean
	public FortuneService getFortuneBean(){
		return new FortuneServiceImpl();
	}
	
	@Bean
	public Coach getCoachBean(){
		return new TennisCoach(getFortuneBean());
	}
	

}
