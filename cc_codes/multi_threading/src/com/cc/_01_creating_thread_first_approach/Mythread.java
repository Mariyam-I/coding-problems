package com.cc._01_creating_thread_first_approach;

public class Mythread extends Thread {

	@Override
	public void run() {
		System.out.println("****************** Child Thread Strated***********************");
			for(int i = 1; i<= 50; i++) {
				System.out.println(i+" ------> Child Thread");
			}
		System.out.println("****************** Child Thread Ended***********************");
	}

	
}
