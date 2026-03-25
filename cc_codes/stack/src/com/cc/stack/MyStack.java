package com.cc.stack;

public class MyStack {
	
	int[] arr;
	int top;
	int capacity;
	
	//Constructor
	public MyStack(int size) {
		top = -1;
		capacity = size;
		arr = new int[size];
	}
	
	//Check for empty stack
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	//check for stack full
	public boolean isFull() {
		if(top == (capacity - 1)) 
			return true;
		return false;
	}
	
	//return the size of stack
	public int size() {
		
		return top + 1;
	}
	
	//Add elements into stack
	public void push(int element) {
		if(isFull()) {
			System.out.println("Stack is full (cannot add element)");
		}
		else {
			arr[++top] = element;
		}
	}
	
	//print the top element
	public void peak() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("\ntop element of stack is : " +arr[top]);
		}
	}
	
	//remove elements from stack
	public void pop(int element) {
		if(isEmpty()) {
			System.out.println("stack is empty (cannot remove element)");
		} else if(arr[top] == element){
			arr[top--] = top;
		} else {
			System.out.println("Element not found...");
		}
	}
	
	//reverse the stack
	public void reverse() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			int i= top;
			int j = 0;
			
			while(j <= i) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i--;
				j++;
			}
		}
	}
	
	//Print the stack data
	public void print() {
		/*System.out.println("Empty = "+isEmpty());
		System.out.println("Top = "+top);*/
		//(top == -1)
		if(isEmpty())  { 
			System.out.println("stack is empty");
			return;
		} else {
			System.out.println("Stack elements are: ");
			for(int i = 0; i <= top ; i++) {
				System.out.print(arr[i] + ", ");
			}
		}
	}
}

