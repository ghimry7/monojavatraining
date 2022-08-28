package com.moncept.queuestatcktest;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class QueueTest {

	public static void main(String[] args) {
		//Queue
		Deque<Integer> queue=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("Enter 1 to push,2 to pop,3 to display and 4 to exit: ");
			int ch=sc.nextInt();
			switch(ch){
			case 1: System.out.println("Enter element: ");
					queue.addFirst(sc.nextInt());
					break;
			case 2: try{
						System.out.println("Remove element is: "+ queue.removeFirst());
						break;
					}
					catch(NoSuchElementException e){
						System.out.println("Empty Queue");
						break;
					}
					
			case 3: System.out.println(queue);
					break;
			case 4: System.exit(0);		
			
			}
		}
	}

}
