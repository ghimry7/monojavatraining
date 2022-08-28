package com.monocept.distance;

public class Distance {
	private int feet;
	private int inch;
	
	public Distance(int feet,int inch){
		this.feet=feet;
		this.inch=inch;
	}
	
	public Distance(int feet){
		this(feet,0);
	}
	
	public Distance(){

	}
	
	public int getFeet(){
		return feet;
	}
	
	public int getInch(){
		return inch;
	}
	
	public Distance add(Distance dist){
		Distance di=new Distance();
		int feet=(this.feet+dist.feet);
		int inch=(this.inch+dist.inch);
		if(inch>=12){
			feet+=inch/12;
			inch=inch%12;
		}
		di.feet=feet;
		di.inch=inch;
		return di;
		
		
	}
	
	public String toString(){
		return feet+" "+inch;
	}

}
