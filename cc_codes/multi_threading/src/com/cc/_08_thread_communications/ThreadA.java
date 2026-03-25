package com.cc._08_thread_communications;
                                           
public class ThreadA {
	
	public static void main(String[] args) throws InterruptedException {

		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			System.out.println("Main Thread Started");
			System.out.println("main Thread waiting");
			b.wait();
			System.out.println("maim Thread got notification");
		}
	}

}



/*
Main Thread Started
main Thread waiting
Child Thread Started
-----> Total = 55
main thread got notification to start
======> Child Thread Addition Job
======> Child Thread Addition Job
======> Child Thread Addition Job
======> Child Thread Addition Job
======> Child Thread Addition Job
======> Child Thread Addition Job
======> Child Thread Addition Job
======> Child Thread Addition Job
======> Child Thread Addition Job
======> Child Thread Addition Job
Child Thread Ended
maim Thread got notification
*/