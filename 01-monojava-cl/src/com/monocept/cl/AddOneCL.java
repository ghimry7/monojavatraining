package com.monocept.cl;

public class AddOneCL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={10,20,30,40};
		for(int i=0;i<num.length;i++){
			num[i]+=1;
		}
		for(int x:num){
			System.out.println(x);
		}

	}

}
