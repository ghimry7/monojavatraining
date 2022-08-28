package com.monocept.test;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str="This is Monocept Java Training";
		StringTokenizer st=new StringTokenizer(str);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		
		
		System.out.println("--------------------------------------------------");
		
		String strcomma="This,is,Monocept,Java,Training";
		StringTokenizer stdelimeter=new StringTokenizer(strcomma,",");
		while(stdelimeter.hasMoreTokens()){
			System.out.println(stdelimeter.nextToken());
		}
		
	
		
		
		
	}

}
