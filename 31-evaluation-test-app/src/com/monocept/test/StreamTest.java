package com.monocept.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.monocept.model.Countries;
import com.monocept.model.Regions;

public class StreamTest {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		Path path=Paths.get("./input.txt");
		List<String> fileData=Files.readAllLines(path);
		
		ArrayList<Countries> conList=new ArrayList<>();
		
		for(String line:fileData){
			if(line!=null){
				String[] sem=line.split(",");
				String abr=sem[0].trim();
				String country=sem[1].trim();
				int id=Integer.parseInt(sem[2].trim());
				conList.add(new Countries(abr,country,id));
			}
		}
		
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
		
		ArrayList<Countries> asia=new ArrayList<>();
		
		System.out.println("Asia");
		
		asia=asiaCon(conList,reg);
		
		System.out.println(asia);
		
		System.out.println("Enter country arc: ");
		String arc=sc.next();
		
		String conName=getCon(conList,arc);
		
		System.out.println(conName);
		
		
		
		
	}
	
	private static String getCon(ArrayList<Countries> conList,String arc) {
		Countries li=(Countries) conList.stream().filter(con->con.getNameAcr().equalsIgnoreCase(arc)).findAny().get();
		
		return li.getCountryName();
	}

	public static ArrayList<Countries> asiaCon(ArrayList<Countries> conList,HashMap<Integer,String> reg){
		return (ArrayList<Countries>) conList.stream().filter(con->reg.get(con.getRegionId()).equalsIgnoreCase("asia")).collect(Collectors.toList());
	}
	

}
