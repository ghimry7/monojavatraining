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

	public FestivalType getFestivalType() {
		return festivalType;
	}

	public double getInterestRates() {
		if(FestivalType.Diwali.equals(festivalType)){
			return 10;
		}
		else if(FestivalType.Christmas.equals(festivalType)){
			return 11;
		}
		else if(FestivalType.Eid.equals(festivalType)){
			return 12;
		}
		else if(FestivalType.NewYear.equals(festivalType)){
			return 13;
		}
		return 8;
	}
	
	public double calculateSimpleInterest(){
		return (principle*getInterestRates()*duration)/100;
	}

}
