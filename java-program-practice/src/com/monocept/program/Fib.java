package com.monocept.program;
import java.util.*;
public class Fib {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int ar[]=new int[num];
		ar[0]=0;
		ar[1]=1;
		for(int i=2;i<num;i++){
			ar[i]=ar[i-2]+ar[i-1];
		}
		for(int i=0;i<num;i++){
			System.out.print(ar[i]+" ");
		}

	}

}
