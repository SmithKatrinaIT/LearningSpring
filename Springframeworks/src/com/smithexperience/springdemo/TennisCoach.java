package com.smithexperience.springdemo;

public class TennisCoach implements Coach {

	//private FortuneService fortuneService;
	private RandomFortuneService randomFortune;
	private String email;
	private String team;

	public TennisCoach() {
		System.out.println("TennisCoach: inside no-arg constructor");
	}

	/*
	 * public FortuneService getFortuneService() { return fortuneService; }
	 * 
	 * public void setFortuneService(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService;
	 
	}*/
	
	public RandomFortuneService getRandomFortune() {
		return randomFortune;
	}

	public void setRandomFortune(RandomFortuneService randomFortune) {
		this.randomFortune = randomFortune;
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

	@Override
	public String getDailyWorkout() {

		return "Practice 15 volleys before doing baseline forarm hits";
	}

	@Override
	public String getDailyFortune() {

		return randomFortune.getFortune();
	}

}
