package com.cc.doubly_linkedList;

public class DoublyLinkedList {

	Node head = null;
	
	//Add last
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
			newNode.prev = current;
			
		}
	}
	
	//Add at first 
	public void addAtFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
	}
	
	//Add at given index
	public void addAtIndex(int index, int element) {
		Node newNode = new Node(element);
		if(head == null) {
			return;
		}
		Node current = head;
		int i = 0;
		while(current != null && i < index) {
			current = current.next;
			i++;
		}
		newNode.prev = current.prev;
		newNode.next = current;
		current.prev.next = newNode;
		current.prev = newNode;
		
	}
	
	//Size of list 
	public int size() {
		int count = 0;
		Node current = head;
		
		while(current != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	//check list Contains element 
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
	
	//Delete last element 
	public void deleteLast() {
		if(head == null) {
			return;
		} else {
			Node current = head;
			while(current != null && current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
	}
	
	//Delete the given data
	public void deleteByData(int element) {
		if(head == null) {
			return;
		}
		Node current = head;
		while(current != null && current.data != element) {
			current = current.next;
		}
		
		current.prev.next = current.next;
		current.next.prev = current.prev;
	}
	
	//Delete at given index
	public void deleteByIndex(int index) {
		if(head == null) {
			return;
		}
		Node current = head;
		int i = 0;
		while(current != null && i < index) {
			current = current.next;
			i++;
		}
		
		current.prev.next = current.next;
		current.next.prev = current.prev;
	}
	
	//update the element at given index
	public void update(int index, int element) {
		if(index < 0) {
			throw new IllegalArgumentException(); 
		}
		Node current = head;
		int i = 0;
		
		while(current != null && i < index) {
			current = current.next;
			i++;
		}
		current.data = element;
	}
	
	//Get the data at given index
	public void get(int index) {
		if(head == null) {
			return;
		}
		if(index < 0) {
			throw new IllegalArgumentException();
		}
		if(index > size()+1) {
			throw new IllegalArgumentException();
		}
		Node current = head;
		int i = 0;
		while(current != null && i < index) {
			current = current.next;
			i++;
		}
		System.out.println("Data at given index ("+ index +") : "+current.data);
	}
	
	//Print forward 
	public void forwardPrint() {
		Node current = head;
		
		while(current != null) {
			System.out.print(current.data +" -> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	//Print backward
	public void reversePrint() {

		Node current = head;
		
		while(current.next != null) {
			current = current.next;
		}
		while(current.prev != null) {
			System.out.print(current.data+" <- ");
			current = current.prev;
		}
		System.out.print(current.data+" <- ");
		System.out.println("null");
	}
	
}