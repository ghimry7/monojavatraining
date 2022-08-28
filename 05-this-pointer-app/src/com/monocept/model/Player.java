package com.monocept.model;

public class Player {
	private int id;
	private String name;
	private int age;
	private int matches;
	
	public Player(int id,String name,int age,int matches){
		this.id=id;
		this.name=name;
		this.age=age;
		this.matches=matches;
	}
	
	public Player(int id,String name,int age){
		this(id,name,age,22);
	}
	public Player(){
		
	}
	
	public Player whoIsElder(Player obj){
		if(age>obj.age){
			return this;
		}else{
			return obj;
		}
	}
	
	public Player whoHasMoreMatches(Player obj){
		if(matches>obj.matches){
			return this;
		}else{
			return obj;
		
		}
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", matches=" + matches + "]";
	}
	
	

}
