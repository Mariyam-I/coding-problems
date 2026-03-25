package com.cc.singleton;

public class Singleton {

	//1. Eager instantiation
//	private static Singleton instance = new Singleton();
	
	//2. On Demand Creation 
	private static Singleton instance = null;
	
	private Singleton() {
		//no-ops
	}
	
	//mark whole method as synchronize for multi thread 
	public static Singleton getInstance() {
		
		//Multiple Objects have been created 
//		instance = new Singleton();
		
		//Check the condition to avoid new obj creations
		/*if(instance == null) {
			instance = new Singleton();
		}*/
		
		
		//3. Multiple Threads 
		
		//5. Double checking 
		if(instance == null) {                  //First check 
			
			//4. bottel neck situation
			
			/*//rather markig the whole method synchronized create the synchronized block 
			synchronized (Singleton.class) {
				instance = new Singleton();
			}*/
			
			synchronized (Singleton.class) {
			if(instance == null) {               //Second check
					instance = new Singleton();
				}
			}
			
		}
		return instance;
	}

	
	//prints the current thread and the object
	public void showMessage() {	
		System.out.println("Thread name : " + Thread.currentThread().getName() + " ----> " + this.hashCode());
		
	}
}
