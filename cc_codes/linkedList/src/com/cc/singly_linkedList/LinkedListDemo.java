package com.cc.singly_linkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		
		System.out.println("Size = "+ list.size());
		System.out.println("\nInitially list is : ");
		list.print();
		
		list.add(10);
		list.add(20);		
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		
		System.out.println("\nAfter adding elements : ");
		list.print();
		
		System.out.println("\nAdding element at first : ");
		list.addFirst(100);
		list.print();
		
		
		System.out.println("\nSize = "+ list.size());
		System.out.println("\nContains(50) = "+ list.contains(50));
		System.out.println("\nContains(30) = "+ list.contains(0));
		
		System.out.println("\nAdding element at given index : (3) ");
		list.addAtIndex(45, 3);
		list.print();
		
		System.out.println("\nDeleting element from list : (50)");
		list.delete(50);
		list.print();
		
		System.out.println("\nPrint the middle element of list : ");
		list.findMiddleElement();
		
	}

}


/*
Size = 0

Initially list is : 
null

After adding elements : 
10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70 -> null

Adding element at first : 
100 -> 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70 -> null

Size = 8

Contains(50) = true

Contains(30) = false

Adding element at given index : (3) 
100 -> 10 -> 20 -> 45 -> 30 -> 40 -> 50 -> 60 -> 70 -> null

Deleting element from list : (50)
100 -> 10 -> 20 -> 45 -> 30 -> 40 -> 60 -> 70 -> null

Print the middle element of list : 
Middle Element is : 30
*/