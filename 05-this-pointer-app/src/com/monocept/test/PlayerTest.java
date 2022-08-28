package com.monocept.test;
import com.monocept.model.*;
public class PlayerTest {

	public static void main(String[] args) {
		Player p1=new Player(1,"Java",21,19);
		Player p2=new Player(2,"Mono",20);
		System.out.println("Elder "+p1.whoIsElder(p2));
		System.out.println("More Matches "+p1.whoHasMoreMatches(p2));
		
		

	}

}
