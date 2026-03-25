package com.cc.singleton;

public class SingletonDemo {

	public static void main(String[] args) {

		/*Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());*/
				
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
		
//		 From SingletonPrac Class
		
		/*SingletonPrac s1 = SingletonPrac.getInstance();
		SingletonPrac s2 = SingletonPrac.getInstance();
		
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();*/

	}

}
