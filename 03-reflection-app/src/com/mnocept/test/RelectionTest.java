package com.mnocept.test;
import java.lang.reflect.*;
public class RelectionTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class className=args[0].getClass();
		Method method[]=className.getMethods();
		for(Method meth:method){
			System.out.println(meth);
		}
		System.out.println("---------------------------------------------------------------------");
		Field field[]=className.getFields();
		for(Field fi:field){
			System.out.println(fi);
		}
		

	}

}
