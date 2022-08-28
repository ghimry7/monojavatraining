package com.monocept.model;

public class Player {
	private int id;
	private String name;
	private int matches;
	private int runs;
	private int wickets;

	public Player(int id, String name, int matches, int runs, int wickets) {
		this.id = id;
		this.name = name;
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
	}
	
	public Player(int id,String name,int matches,int runs){
		this(id,name,matches,runs,90);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMatches() {
		return matches;
	}

	public int getRuns() {
		return runs;
	}

	public int getWickets() {
		return wickets;
	}

}
