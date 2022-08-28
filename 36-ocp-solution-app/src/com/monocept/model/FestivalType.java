package com.monocept.model;

public enum FestivalType {
	Diwali(10), Christmas(11), Eid(12), NewYear(13);
	
	private int rate;
	
	FestivalType(int rate){
		this.rate=rate;
	}
	
	public int getRate(){
		return rate;
	}

}
