package com.monocept.model;

public class Regions {
	private int regionId;
	private String regionName;
	
	
	public Regions(int regionId, String regionName) {
		super();
		this.regionId = regionId;
		this.regionName = regionName;
	}
	
	public Regions(){
		
	}
	public int getRegionId() {
		return regionId;
	}

	public String getRegionName() {
		return regionName;
	}

}
