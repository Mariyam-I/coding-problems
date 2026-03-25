package com.cc._08_thread_communications;

public class ThreadB extends Thread{

	int total = 0;

	@Override
	public void run() {

		synchronized (this) {
			System.out.println("Child Thread Started");
			for(int i = 1; i <= 10; i++) {
				total = total + i;
			}
			System.out.println("-----> Total = "+total);
			notify();
		}
		System.out.println("main thread got notification to start");
		for(int i = 0; i < 10; i++) {
			System.out.println("======> Child Thread Addition Job");
		}
		System.out.println("Child Thread Ended");
	}
}
