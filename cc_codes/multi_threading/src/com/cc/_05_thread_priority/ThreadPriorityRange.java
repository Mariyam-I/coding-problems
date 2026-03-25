package com.cc._05_thread_priority;

public class ThreadPriorityRange extends Thread{

	/*public static final int MIN_PRIORITY = 1;
	public static final int NORM_PRIORITY = 5;
	public static final int MAX_PRIORITY = 10;
	*/
	
	@Override
	public void run() {
		System.out.println("Child Thread " +Thread.currentThread().getPriority());
	}
	
}
