package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Node;

public class CustomLinkedList {

	public static Node head = null;

	public static void main(String[] args) {
		CustomLinkedList ll = new CustomLinkedList();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(
					"1.addFirst 2.addLast 3.addPosition 4.removeFirst 5.removeLast 6.removeAtPos 7.Display 8.Exit!!!");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				ll.addFirst(sc.nextInt());
				break;
			case 2:
				ll.addLast(sc.nextInt());
				break;
			case 3:
				ll.addAtPos(sc.nextInt(), sc.nextInt());
				break;
			case 4:
				ll.removeFirst();
				break;
			case 5:
				ll.removeLast();
				break;
			case 6:
				ll.removeAtPos(sc.nextInt());
				break;
			case 7:
				ll.display();
				break;
			case 8:
				System.exit(0);

			}
		}
		

	}

	public void addFirst(int data) {
		Node temp = new Node();
		temp.setData(data);
		temp.setNode(null);
		if (head == null) {
			head = temp;
		} else {
			temp.setNode(head);
			head = temp;

		}
	}

	public void addLast(int data) {
		Node temp = new Node();
		temp.setData(data);
		if (head == null) {
			head = temp;
		} else {
			Node cur = new Node();
			cur = head;
			while (cur.getNode() != null) {
				cur = cur.getNode();
			}
			cur.setNode(temp);
		}
	}

	public void addAtPos(int data, int pos) {
		Node temp = new Node();
		temp.setData(data);
		int count = 1;
		if (head == null) {
			head = temp;
		} else {
			Node cur = new Node();
			cur = head;
			while (cur.getNode() != null && count != pos - 1) {
				cur = cur.getNode();
				count++;
			}
			temp.setNode(cur.getNode());
			cur.setNode(temp);

		}
	}

	public void removeFirst() {

		if (head == null) {
			System.out.println("List Empty!!!");
		} else {
			Node cur = new Node();
			cur = head;
			head = head.getNode();
			cur = null;
		}

	}

	public void removeLast() {
		
		if (head == null) {
			System.out.println("List Empty!!!");
		} else {
			Node cur = new Node();
			Node prev=new Node();
			cur = head;
			while (cur.getNode() != null) {
				prev=cur;
				cur = cur.getNode();
			}
			prev.setNode(null);
			cur=null;
		}
		
	}

	public void removeAtPos(int pos) {
		if (head == null) {
			System.out.println("List Empty!!!");
		} else {
			Node cur = new Node();
			Node prev=new Node();
			cur = head;
			int count=1;
			while (cur.getNode() != null && count!=pos ) {
				prev=cur;
				cur = cur.getNode();
				count++;
			}
			prev.setNode(cur.getNode());
			cur=null;
		}
	}

	public void display() {
		Node cur = new Node();
		if (head == null) {
			System.out.println("List Empty!!!");
		} else {
			cur = head;
			while (cur != null) {
				System.out.println("Data: " + cur.getData());
				cur = cur.getNode();
			}
		}
	}

}
