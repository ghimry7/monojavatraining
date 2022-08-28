package com.monocept.test;

public class StaticOuterClass {

	static class InnerClass {
		private String name;

		public InnerClass(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	public static void main(String[] args) {
		StaticOuterClass.InnerClass ic=new StaticOuterClass.InnerClass("Static Class Java");
		System.out.println(ic.getName());
	}

}
