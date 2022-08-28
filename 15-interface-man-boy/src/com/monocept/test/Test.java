package com.monocept.test;
import com.monocept.model.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy boy=new Boy();
		atTheParty(boy);
		
		Man man=new Man();
		atTheParty(man);
		atTheMovies(man);
		
		

	}
	public static void atTheParty(IMannerable manner){
		manner.greet();
		manner.depart();
	}
	
	public static void atTheMovies(IEmotional emo){
		emo.cry();
		emo.laugh();
	}

}
