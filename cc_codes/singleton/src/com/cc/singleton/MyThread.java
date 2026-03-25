package com.cc.singleton;

public class MyThread extends Thread{

	@Override
	public void run() {

		Singleton s1 = Singleton.getInstance();
		s1.showMessage();
		
		/*SingletonPrac s2 = SingletonPrac.getInstance();
		s2.showMessage();*/
	}	
	
}
