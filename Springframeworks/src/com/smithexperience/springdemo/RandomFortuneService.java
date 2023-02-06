package com.smithexperience.springdemo;

import java.util.ArrayList;
import java.util.Random;

public class RandomFortuneService implements FortuneService{
	
	private Random random;
	private ArrayList<String> fortunes;

	
	@Override
	public String getFortune() {
		fortunes = new ArrayList<String>();
		fortunes.add("Don’t hold onto things that require a tight grip.");
		fortunes.add("Little by Little one travels far");
		fortunes.add("There is nothing stronger than a broken woman who has rebuilt herself.");
		
		random = new Random();
		
		int index = random.nextInt(fortunes.size());
		
		return fortunes.get(index);
	}

}
