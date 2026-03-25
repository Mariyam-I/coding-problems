package com.cc.singly_linkedList;

public class MyLinkedList {

	Node head = null;
	
	//Add at last 
	public void add(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		} else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	//Add at first
	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	//Return the size of list
	public int size() {
		int count = 0;
		Node current = head;
		
		while(current != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	//Check given element is present in the list 
	public boolean contains(int element) {
		Node current = head;
		while(current != null) {
			if(current.data == element) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	//Add element at given index
	public void addAtIndex(int data, int index) {
		
		Node newNode = new Node(data);
//		int count = 0;
		
		if(index < 0) {
			throw new IllegalArgumentException("Index cannot be negative");
		} else if(index == 0) {
			addFirst(data);
		} else if(index > size()+1) {
			throw new IllegalArgumentException("Index cannot be more than list size");
		} else if(index == size()+1) {
			add(data);
		} /*else {
			Node current = head;
			while(current != null) {
				Node temp = current.next;
				if(count == index-1) {
					current.next = newNode;
					newNode.next = temp;	
				}
				current = current.next;
				count++;
			}
		}*/
		else {
			Node current = head;
			int count = 1;
			while(current != null && count != index) {
				current = current.next;
				count++;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}
	
	//Delete element from list 
	public void delete(int element) {
		if(head == null) {
			return;
		}
		if(head.data == element) {
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next != null && current.next.data != element) {
			current = current.next;
		}
		if(current.next != null) {
			current.next = current.next.next;
		}
	}
	
	//Find the middle element of list 
	public void findMiddleElement() {
		if(head == null) {
			return;
		}
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Middle Element is : " +slow.data);
	}
	
	//Check the given list is circular or not
	public void isCicular() {
		if(head == null) {
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		if(current.next == null) {
			System.out.println("Not a circular linked list");
		} else {
			System.out.println("It is circular linked list");
		}
	}
	
	//Print the list
	public void print() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}
