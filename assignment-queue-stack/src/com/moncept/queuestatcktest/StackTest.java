package com.moncept.queuestatcktest;

import java.util.*;



public class StackTest {

	public static void main(String[] args) {
		//Stack implementation using deque
		Deque<Integer> stack=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("Enter 1 to push,2 to pop,3 to display and 4 to exit: ");
			int ch=sc.nextInt();
			switch(ch){
			case 1: System.out.println("Enter element: ");
					stack.addLast(sc.nextInt());
					break;
			case 2: try{
						System.out.println("Remove element is: "+ stack.removeLast());
						break;
					}
					catch(NoSuchElementException e){
						System.out.println("Empty Stack");
						break;
					}
					
			case 3: System.out.println(stack);
					break;
			case 4: System.exit(0);		
			
			}
		}
		
		
		
		
		

	}

}
