package com.monocept.model;

public class FixedDeposit {
	private String name;
	private double principle;
	private int duration;
	private FestivalType festivalType;

	public FixedDeposit(String name, double principle, int duration, FestivalType festivalType) {
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festivalType = festivalType;
	}

	public String getName() {
		return name;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getDuration() {
		return duration;
	}

	public int getInterestRates() {
		return festivalType.getRate();
	}
	
	public double calculateSimpleInterest(){
		return (principle*getInterestRates()*duration)/100;
	}

}
