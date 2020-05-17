package com.navishka.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	public TennisCoach(){
	}
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	*/
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/


	@Override
	public String getDailyWorkout() {
		return "Practice backhand";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
