package com.cc._5_constructors;

public class ConstructorRules {

	public static void main(String[] args) {

		
	}

	ConstructorRules() { 
		/*this();     Error (In default constructor when we call that constructor only ) :
					Recursive constructor invocation ConstructorRules()
*/
					//		super();	Error --->Constructor call must be the first statement in a constructor
//		this();		Error --->Constructor call must be the first statement in a constructor
		System.out.println("Inside Constructor");
//		super();	Error --->Constructor call must be the first statement in a constructor
//		this();		Error --->Constructor call must be the first statement in a constructor
		
	}

}
