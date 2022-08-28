package com.monocept.pigdice;

import java.util.*;

public class PigDice {

	int turn = 1;
	int total = 0;

	public static void main(String[] args) {
		pigDice();
	}

	public static void pigDice() {
		PigDice pigdice=new PigDice();
		boolean flag = true;
		while (flag) {
			System.out.println("Welcome to the game of Pig!");
			flag =pigdice.game();
		}
	}

	public boolean game() {
		Scanner sc = new Scanner(System.in);
		int holdScore=0;
		System.out.println("Turn: " + turn + "\n---------------------------------------------------------");
		while (true) {
			System.out.println("Enter 'r' to roll again, 'h' to hold.");
			String ch = sc.next();
			int dice = 0;
			int roll=0;
			//When user press "r"
			if (ch.equals("r")) {
				//Rolling dice
				dice = random();
				// dice=sc.nextInt(); //For testing the program
				System.out.println("You rolled: " + dice);
				//When dice is between 2-6
				if (dice != 1) {
					roll += dice;
					holdScore+=roll;
					//When roll is >=20 Player Wins and return false
					if (total+holdScore >= 20) {
						total+= roll;
						System.out.println("You turn score is " + (holdScore) + " and your total score is " + total);
						System.out.printf("You Win, you finished in %d turn", turn);
						System.out.println("\n Game Over!!!");
						return false;
					} 
					//When roll is <= 20
					else {
						
						System.out.println("Your turn score is " + (holdScore) + " and your total score is " + total);
						System.out.println("If you hold, you will have " + (holdScore+total) + " points.");
					}
				}
				//When dice is 1
				else {
					turn++;
					System.out.println("Turn Over, No Score!!!");
					return true;
				}
			} 
			//When user press"h"
			else if (ch.equals("h")) {
				total+=holdScore;
				turn++;
				System.out.println("Your turn score is " + (holdScore) + " and your total score is " + total);
				System.out.println("Turn: " + turn + "\n-------------------------------------------------------");
				holdScore=0;
			} 
			//When User press wrong key
			else {
				System.out.println("Inavlid Key");
			}
			

		}
	}
	
	
	
	//Get random number between 1-6
	public static int random() {
		int min=1;
		int max=6;
		return (int) ((Math.random() * (max - min)) + min);

	}

}
