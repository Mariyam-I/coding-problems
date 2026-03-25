package com.cc.stack;

public class MyStackDemo {

	public static void main(String[] args) {

		MyStack stack = new MyStack(5);
		
		System.out.println("Is Empty : "+ stack.isEmpty());
		System.out.println("Is Full : "+ stack.isFull());
		System.out.println("Size : "+stack.size());
		
		System.out.println("Initially data in stack : ");
		stack.print();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("\nAfter adding elements into stack");
		stack.print();
		
		System.out.println();
		stack.peak();
		
		stack.pop(50);
		System.out.println("\nAfter deleting top element");
		stack.print();
		
		System.out.println();
		System.out.println("\nDeleting the element which is not present --> (100)");
		stack.pop(50);
		
		System.out.println();
		stack.push(60);
		stack.print();
		
		System.out.println();
		System.out.println("\nReversing the stack");
		stack.reverse();
		stack.print();
	}

}


/*
Is Empty : true
Is Full : false
Size : 0
Initially data in stack : 
stack is empty

After adding elements into stack
Stack elements are: 
10, 20, 30, 40, 50, 

top element of stack is : 50

After deleting top element
Stack elements are: 
10, 20, 30, 40, 

Deleting the element which is not present --> (100)
Element not found...

Stack elements are: 
10, 20, 30, 40, 60, 

Reversing the stack
Stack elements are: 
60, 40, 30, 20, 10, 
*/
