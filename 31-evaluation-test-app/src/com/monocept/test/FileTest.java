package com.monocept.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.monocept.model.Countries;
import com.monocept.model.Regions;

public class FileTest {

	public static void main(String[] args) throws IOException {
		Countries countryObj = new Countries();
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> reg = new HashMap<>();

		// Taking input from file
		BufferedReader bufReader = new BufferedReader(new FileReader("./input.txt"));
		String line = bufReader.readLine();
		ArrayList<Countries> al = new ArrayList<>();
		while (line != null) {
			line = bufReader.readLine();
			if(line!=null){
			try {
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					String ch = st.nextToken();
					StringTokenizer s = new StringTokenizer(ch, ",");
					Countries conObj = new Countries();
					while (s.hasMoreTokens()) {
						conObj.setNameAcr(s.nextToken());
						conObj.setCountryName(s.nextToken());
						int c = Integer.parseInt(s.nextToken());
						conObj.setRegionId(c);
						al.add(conObj);
					}
				}
			}
			catch (Exception e) {
				
				}
			} 
		}
		
		
		Regions[] region = new Regions[4];
		region[0] = new Regions(1, "Europe");
		region[1] = new Regions(2, "Americas");
		region[2] = new Regions(3, "Asia");
		region[3] = new Regions(4, "Middle East and Africa");

		reg.put(region[0].getRegionId(), region[0].getRegionName());
		reg.put(region[1].getRegionId(), region[1].getRegionName());
		reg.put(region[2].getRegionId(), region[2].getRegionName());
		reg.put(region[3].getRegionId(), region[3].getRegionName());

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
		String acr = sc.next();
		Countries acrCon = countryObj.arcCon(al, acr);
		System.out.println(acrCon.getNameAcr() + ", " + acrCon.getCountryName() + ", " + acrCon.getRegionId() + ", "
				+ reg.get(acrCon.getRegionId()));

		bufReader.close();

	}

}
