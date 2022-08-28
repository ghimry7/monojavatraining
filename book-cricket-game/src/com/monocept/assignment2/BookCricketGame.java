package com.monocept.assignment2;

import java.util.*;

public class BookCricketGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to enter game or 0 to exit: ");
		int choice = sc.nextInt();
		switch (choice) {
		case 0:
			System.exit(0);
			break;
		case 1:
			enterGame();
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}

	}

	private static void enterGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player 1 name: ");
		String player1 = sc.next();
		System.out.println("Enter Player 2 name: ");
		String player2 = sc.next();
		playerOne(player1, player2);

	}

	private static void playerOne(String player1, String player2) {
		Scanner sc = new Scanner(System.in);
		String playerr2 = player2;
		int score = 0;
		int round = 1;
		System.out.println("Player: " + player1);
		boolean flag = true;
		while (flag) {
			System.out.println("Enter 1 to open book: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				int page = randomPage();
				int point = page % 7;
				if (point != 0) {
					score += point;
					round++;
				} else {
					flag = false;
				}
				System.out.println("Page: " + page + "\t point: " + point + "\t score: " + score);
				break;
			default:System.out.println("Invalid Input");	
			}

		}
		System.out.println(player1 + " total score: " + score);
		System.out.println(player1 + " takes " + round + " rounds.");
		playerTwo(score, round, player1, playerr2);

	}

	private static void playerTwo(int score, int round, String player1, String player2) {
		Scanner sc = new Scanner(System.in);
		System.out.println(player2 + " needs to score " + (score + 1) + " in " + round + " rounds.");
		int score2 = 0;
		int round2 = 1;
		System.out.println("Player: " + player2);
		boolean flag = true;
		while (flag) {
			if (round > 0) {
				System.out.println("Enter 1 to open book: ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					int page = randomPage();
					int point = page % 7;

					if (point != 0) {
						score2 += point;
						round--;
						System.out.println("Page: " + page + "\t point: " + point + "\t score: " + score2
								+ "\t round left:" + round);
						if (score2 > score) {
							System.out.println(player2 + " WINS!!!");
							flag = false;
						}

					} else {
						System.out.println("Page: " + page + "\t point: " + point + "\t score: " + score2
								+ "\t round left:" + round);
						if (score > score2) {
							System.out.println(player1 + " WINS!!!");
							flag = false;
						}
					}

					break;
				}

			} else {
				System.out.println(player1 + " WINS!!!");
			}
		}

	}

	public static int randomPage() {
		int min = 1;
		int max = 300;
		int random_int = (int) Math.floor((Math.random() * (max - min)) + min);
		return random_int;
	}

}
