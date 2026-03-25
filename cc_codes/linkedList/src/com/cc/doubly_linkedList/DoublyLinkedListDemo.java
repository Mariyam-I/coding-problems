package com.cc.doubly_linkedList;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		System.out.println("Forward printing");
		list.forwardPrint();
		
		System.out.println("\nBackward printing");
		list.reversePrint();
		
		System.out.println("\nAdd At first");
		list.addAtFirst(1);
		list.forwardPrint();
		
		System.out.println("\nSize : "+ list.size());
		System.out.println("\nContains (30) : "+ list.contains(30));
		System.out.println("\nContains (0) : "+ list.contains(0));
		
		System.out.println("\nUpdate at given index (2)");
		list.update(2, 15);
		list.forwardPrint();
		
		System.out.println("\nDelete last Node");
		list.deleteLast();
		list.forwardPrint();
		
		System.out.println();
		list.get(2);
		
		System.out.println("\nDelete by data");
		list.deleteByData(15);
		list.forwardPrint();
		
		System.out.println("\nDelete by index");
		list.deleteByIndex(3);
		list.forwardPrint();
		
		System.out.println("\n Add at given index");
		list.addAtIndex(2, 40);
		list.forwardPrint();
	}

}




/*
Forward printing
10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null

Backward printing
60 <- 50 <- 40 <- 30 <- 20 <- 10 <- null

Add At first
1 -> 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null

Size : 7

Contains (30) : true

Contains (0) : false

Update at given index (2)
1 -> 10 -> 15 -> 30 -> 40 -> 50 -> 60 -> null

Delete last Node
1 -> 10 -> 15 -> 30 -> 40 -> 50 -> null

Data at given index (2) : 15

Delete by data
1 -> 10 -> 30 -> 40 -> 50 -> null

Delete by index
1 -> 10 -> 30 -> 50 -> null

 Add at given index
1 -> 10 -> 40 -> 30 -> 50 -> null
*/