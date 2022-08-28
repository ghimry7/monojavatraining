package com.monocept.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.monocept.model.Countries;
import com.monocept.model.Regions;

public class Test {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		Countries countryObj = new Countries();
		
		HashMap<Integer, String> reg = new HashMap<>();

		Regions[] region = new Regions[4];
		region[0] = new Regions(1, "Europe");
		region[1] = new Regions(2, "Americas");
		region[2] = new Regions(3, "Asia");
		region[3] = new Regions(4, "Middle East and Africa");

		reg.put(region[0].getRegionId(), region[0].getRegionName());
		reg.put(region[1].getRegionId(), region[1].getRegionName());
		reg.put(region[2].getRegionId(), region[2].getRegionName());
		reg.put(region[3].getRegionId(), region[3].getRegionName());

		Countries[] country = new Countries[5];
		country[0] = new Countries("IT", "Italy", 1);
		country[1] = new Countries("JP", "Japan", 3);
		country[2] = new Countries("US", "USA", 4);
		country[3] = new Countries("CA", "China", 2);
		country[4] = new Countries("IN", "India", 3);
		
		

		ArrayList<Countries> al = new ArrayList<>();
		al.add(country[0]);
		al.add(country[1]);
		al.add(country[2]);
		al.add(country[3]);
		al.add(country[4]);

		ArrayList<Countries> euro = countryObj.Europe(al, reg);
		System.out.println("European Countries:");
		for (Countries con : euro) {
			System.out.println(con.getNameAcr() + ", " + con.getCountryName() + ", " + con.getRegionId());
		}
		System.out.println("-----------------------------------------------------");

		ArrayList<Countries> ameri = countryObj.Americas(al, reg);
		System.out.println("Americans Countries:");
		for (Countries con : ameri) {
			System.out.println(con.getNameAcr() + ", " + con.getCountryName() + ", " + con.getRegionId());
		}
		System.out.println("-----------------------------------------------------");
		
		
		ArrayList<Countries> asia = countryObj.Asia(al, reg);
		System.out.println("Asian Countries:");
		for (Countries con : asia) {
			System.out.println(con.getNameAcr() + ", " + con.getCountryName() + ", " + con.getRegionId());
		}
		System.out.println("-----------------------------------------------------");
		
		
		ArrayList<Countries> mea = countryObj.MEA(al, reg);
		System.out.println("MEA Countries:");
		for (Countries con : mea) {
			System.out.println(con.getNameAcr() + ", " + con.getCountryName() + ", " + con.getRegionId());
		}
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Enter Abbrevation: ");
		String acr=sc.next();
		Countries acrCon=countryObj.arcCon(al, acr);
		System.out.println(acrCon.getNameAcr() + ", " + acrCon.getCountryName() + ", " + acrCon.getRegionId()+", "+reg.get(acrCon.getRegionId()));
		
		 
		
	}

}
