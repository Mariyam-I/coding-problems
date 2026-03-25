package com.cc._5_constructors;


//			Rule - 3  : Modifiers Allowed (public, private, protected, package)


public class Constructor {
	int i;
	int j;
	
	public Constructor (int i) {
		
	}
	
	 protected Constructor(int i, int j) {
		this.i = i;
		this.j = j;
	}
	 
	/*package Constructor(int i) {
//		Error : Syntax error on token "package", delete this token
	}*/
	
	/*private  Constructor() {
		
	}*/
	
	
	Constructor() {
//	Access Modifier ===> package
	}
 
	/*Strictfp  Constructor() {
	//Error : Strictfp cannot be resolved to a type	
	}*/
	
	
	

	public static void main(String[] args) {
	}

}
