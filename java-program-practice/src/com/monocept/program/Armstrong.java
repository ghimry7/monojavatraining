package com.monocept.program;
import java.lang.Math;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Armstrong numbers are:");
		for(int i=10;i<=9999;i++){
			int num=i;
			int temp=i;
			int res=i;
			int sum=0;
			int count=0;
			while(num!=0){
				num=num/10;
				count++;
			}
			while(temp!=0){
				int digit=temp%10;
				sum+=Math.pow(digit, count);
				temp=temp/10;
			}
			if(res==sum){
				System.out.println(res);
			}
		}

	}

}
