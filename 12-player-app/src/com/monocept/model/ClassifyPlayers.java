package com.monocept.model;

public class ClassifyPlayers {
	Player players[];

	public ClassifyPlayers(Player[] players) {
		this.players = players;
	}

	public Player[] getAListers() {
		int size = 0;
		for (int i = 0; i < players.length; i++) {
			if (players[i].getMatches() > 100 && (players[i].getRuns() > 5000 || players[i].getWickets() > 150)) {
				size++;
			}
		}
		Player aList[] = new Player[size];
		int j = 0;
		for (int i = 0; i < players.length; i++) {

			if (players[i].getMatches() > 100 && (players[i].getRuns() > 5000 || players[i].getWickets() > 150)) {
				aList[j] = players[i];
				players[i] = null;
				j++;
			}

		}

		return aList;
	}

	public Player[] getBListers() {
		int size = 0;
		for (int i = 0; i < players.length; i++) {
			if (players[i] != null) {
				if (players[i].getMatches() > 50 && (players[i].getRuns() > 3000 || players[i].getWickets() > 75)) {
					size++;
				}
			}
		}
		Player bList[] = new Player[size];
		int j = 0;
		for (int i = 0; i < players.length; i++) {
			if (players[i] != null) {
				if (players[i].getMatches() > 50 && (players[i].getRuns() > 3000 || players[i].getWickets() > 75)) {
					bList[j] = players[i];
					players[i] = null;
					j++;
				}
			}
		}
		return bList;

	}

	public Player[] getCListers() {
		int size = 0;
		for (int i = 0; i < players.length; i++) {
			if (players[i] != null) {
				size++;
			}
		}
		Player cList[] = new Player[size];
		int j = 0;
		for (int i = 0; i < players.length; i++) {
			if (players[i] != null) {
				cList[j] = players[i];
				j++;

			}
		}
		return cList;
	}

}
