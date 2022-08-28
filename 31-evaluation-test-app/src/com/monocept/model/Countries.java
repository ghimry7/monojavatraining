package com.monocept.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Countries {
	

	private String nameAcr;
	private String countryName;
	private int regionId;

	public Countries(String nameAcr, String countryName, int regionId) {
		super();
		this.nameAcr = nameAcr;
		this.countryName = countryName;
		this.regionId = regionId;
	}

	public Countries() {

	}

	public String getNameAcr() {
		return nameAcr;
	}

	public String getCountryName() {
		return countryName;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setNameAcr(String nameAcr) {
		this.nameAcr = nameAcr;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	
	@Override
	public String toString() {
		return nameAcr +"," + countryName + "," + regionId+"\n";
	}

	public ArrayList<Countries> Asia(ArrayList<Countries> al, HashMap<Integer, String> reg) {
		ArrayList<Countries> asiaCon = new ArrayList<>();
		for (Countries con : al) {
			if (reg.get(con.getRegionId()).equalsIgnoreCase("Asia")) {
				asiaCon.add(con);
			}
		}
		return asiaCon;
	}

	public ArrayList<Countries> Europe(ArrayList<Countries> al, HashMap<Integer, String> reg) {
		ArrayList<Countries> euroCon = new ArrayList<>();
		for (Countries con : al) {
			if (reg.get(con.getRegionId()).equalsIgnoreCase("Europe")) {
				euroCon.add(con);
			}
		}
		return euroCon;
	}

	public ArrayList<Countries> Americas(ArrayList<Countries> al, HashMap<Integer, String> reg) {
		ArrayList<Countries> ameriCon = new ArrayList<>();
		for (Countries con : al) {
			if (reg.get(con.getRegionId()).equalsIgnoreCase("Americas")) {
				ameriCon.add(con);
			}
		}
		return ameriCon;
	}

	public ArrayList<Countries> MEA(ArrayList<Countries> al, HashMap<Integer, String> reg) {
		ArrayList<Countries> meaCon = new ArrayList<>();
		for (Countries con : al) {
			if (reg.get(con.getRegionId()).equalsIgnoreCase("Middle East and Africa")) {
				meaCon.add(con);
			}
		}
		return meaCon;
	}

	public Countries arcCon(ArrayList<Countries> al, String acr) {
		Countries acrCon = new Countries();
		for (Countries con : al) {
			if (con.getNameAcr().equalsIgnoreCase(acr)) {
				acrCon = con;
			}
		}
		return acrCon;

	}

}
