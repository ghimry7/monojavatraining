package com.monocept.program;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int fact=1;
		while(num!=0){
			fact*=num;
			num--;
		}
		System.out.println("Factorial of "+temp+" is "+fact);

	}

}
