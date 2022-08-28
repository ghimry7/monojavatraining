package com.monocept.test;

import java.util.*;

import com.monocept.model.*;

public class GuitarTest {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.Fender, "Stratocastor", Type.Electric,Wood.Alder, Wood.Alder);
		List<Guitar> guitarMatch = inventory.search(whatErinLikes);
		int count=0;
		if(!guitarMatch.isEmpty()){
			System.out.println("Erin you might like this ");
			for(Guitar guitar:guitarMatch){
				GuitarSpec spec=guitar.getSpec();
				System.out.println(++count +". "+"We have a "+spec.getBuilder()+" "+spec.getModel()+" "+spec.getType()+" guitar:\n"+spec.getBackWood()+" back and sides, "+
				" "+spec.getTopWood()+" top.\n"+"You can have it at price Rs "+guitar.getPrice());
			}
		}
		else{
			System.out.println("Sorry Erin, we have nothing for you!!!");
		}
			
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("A123", 5000, Builder.Fender, "Stratocastor", Type.Electric, Wood.Alder, Wood.Alder);
		inventory.addGuitar("B123", 4500, Builder.Fender, "Stratocastor", Type.Electric, Wood.Alder, Wood.Alder);
	}
}


