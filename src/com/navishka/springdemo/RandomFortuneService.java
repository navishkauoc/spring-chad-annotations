package com.navishka.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create an array of strings
	private String[] data = {
			"Beware of Dogs",
			"Diligence is mother of good luck",
			"Wisdom Enlightens"
	};
	
	//Create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//Pick a random string from array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
