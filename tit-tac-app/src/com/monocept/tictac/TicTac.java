package com.monocept.tictac;

import java.util.Scanner;

public class TicTac {
	static int count = 0;

	public static void main(String[] args) {
		TicTac tictac = new TicTac();
		char arr[][] = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = ' ';
			}
		}
		tictac.player1(arr);
	}

	public void player1(char arr[][]) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Player 'X', enter your move (row[1-3] column[1-3]): ");
			int row = sc.nextInt();
			int col = sc.nextInt();

			if (arr[row - 1][col - 1] == ' ') {
				arr[row - 1][col - 1] = 'X';
				count++;
				displayBoard(arr);
				flag = checkWinner(arr);// If player X wins then flag is false
										// else flag is true
				if (flag) {
					flag = player2(arr);
				}

			}

			else {
				System.out.println("Already filled!!! ");
			}

		}
	}

	public static boolean player2(char[][] arr) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (true) {
			System.out.println("Player 'O', enter your move (row[1-3] column[1-3]): ");
			int row = sc.nextInt();
			int col = sc.nextInt();

			if (arr[row - 1][col - 1] == ' ') {
				arr[row - 1][col - 1] = 'O';
				displayBoard(arr);
				count++;
				flag = checkWinner(arr);// If player O wins then flag is false
										// else flag is true
				return flag;
			}

			else {
				System.out.println("Already filled!!! ");
			}

		}
	}

	public static void displayBoard(char arr[][]) {
		int i;
		int j;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length - 1; j++) {
				System.out.print(arr[i][j] + "\t|");
			}
			System.out.println(arr[i][j]);
			if (i != arr.length - 1) {
				System.out.println("--------------------------");
			}

		}

	}

	

	 public static boolean checkWinner(char arr[][]) {
	
	 if(count==(arr.length*arr.length)){
	 System.out.println("Match Draw!!!");
	 return false;
	 }
	
	 for (int i = 0; i < 3; i++) {
	 // Vertical
	 if (arr[i][0] != ' ') {
	 if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
	 System.out.println("Player '" + arr[i][0] + "' Wins!!!");
	 return false;
	 }
	 }
	 // horizontal
	 if (arr[0][i] != ' ') {
	 if (arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i]) {
	 System.out.println("Player '" + arr[i][i] + "' Wins!!!");
	 return false;
	 }
	 }
	 }
	
	 // diagonal
	 if (arr[1][1] != ' ') {
	 if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
	 System.out.println("Player '" + arr[0][0] + "' Wins!!!");
	 return false;
	 }
	 if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) {
	 System.out.println("Player '" + arr[0][2] + "' Wins!!!");
	 return false;
	 }
	 }
	 return true;
	
	 }

}
