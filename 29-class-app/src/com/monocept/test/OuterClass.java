package com.monocept.test;

public class OuterClass {
	
	class InnerClass{
		private String name;
		
		public InnerClass(String name){
			this.name=name;
		}
		
		public String getName(){
			return name;
		}
	}

	public static void main(String[] args) {
		OuterClass oc=new OuterClass();
		OuterClass.InnerClass ic=oc.new InnerClass("Java");
		
		System.out.println(ic.getName());
		
	}

}
