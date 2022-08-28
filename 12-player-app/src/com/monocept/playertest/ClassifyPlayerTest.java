package com.monocept.playertest;

import com.monocept.model.*;

public class ClassifyPlayerTest {

	public static void main(String[] args) throws Exception {

		ClassifyPlayerTest cpt = new ClassifyPlayerTest();

		Player[] players = new Player[10];
		players[0] = new Player(1, "Sheldon", 200, 4000, 100);
		players[1] = new Player(2, "Rajesh", 42, 362);
		players[2] = new Player(3, "Will", 200, 5205, 350);
		players[3] = new Player(4, "Wolli", 200, 3256, 120);
		players[4] = new Player(5, "Joey", 200, 5205, 350);
		players[5] = new Player(6, "Kholi", 300, 10023, 500);
		players[6] = new Player(7, "Dhoni", 326, 8965, 170);
		players[7] = new Player(8, "Lee", 47, 250, 120);
		players[8] = new Player(9, "Rohit", 350, 9652, 325);
		players[9] = new Player(10, "ABD", 250, 9563, 150);

		ClassifyPlayers obj = new ClassifyPlayers(players);

		Player[] aLister = obj.getAListers();
		System.out.println("A Lister");
		cpt.display(aLister);

		System.out.println("B Lister");
		Player[] bLister = obj.getBListers();
		cpt.display(bLister);

		System.out.println("C Lister");
		Player[] cLister = obj.getCListers();
		cpt.display(cLister);

	}

	public void display(Player[] players) {
		if (players.length > 0) {
			for (int i = 0; i < players.length; i++) {
				System.out.print(players[i].getId() + ", ");
				System.out.print(players[i].getName() + ", ");
				System.out.print(players[i].getMatches() + ", ");
				System.out.print(players[i].getRuns() + ", ");
				System.out.println(players[i].getWickets() + ", ");
				System.out.println("--------------------------------------------");
			}
		}else{
			System.out.println("No Player Found!!!");
		}
	}

}
