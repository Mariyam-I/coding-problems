package com.cc._02_creating_thread_second_approach;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("****************** Child Thread Strated***********************");
			for(int i = 1; i<= 50; i++) {
				System.out.println(i+" ------> Child Thread");
			}	
		System.out.println("****************** Child Thread Ended***********************");
	}

}
