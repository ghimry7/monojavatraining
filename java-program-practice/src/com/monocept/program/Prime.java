package com.monocept.program;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int flag=0;
		for(int i=2;i<num/2;i++){
			if(num%i==0){
				flag=1;
			}
		}
		if(flag==0){
			System.out.println(num+" is prime.");
		}
		else{
			System.out.println(num+" is not prime.");
		}
	}

}
