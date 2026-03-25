package com.cc._03_replacing_start_by_run;

public class StartRun extends Thread{
	
		@Override
		public void run() {
			System.out.println("****************** Child Thread Strated***********************");
				for(int i = 1; i<= 10; i++) {
					System.out.println(i+" ------> Child Thread");
				}
			System.out.println("****************** Child Thread Ended***********************");
		}
		
		//Overloaded run() ----> we neend to call this method explicitly 
		public void run(int x) {
			for(int i = 1; i<= 10; i++) {
				System.out.println(x+" ------> Child Thread");
			}
		}

		@Override
		public synchronized void start() {
			System.out.println("start() method ");
		}
		
		
}
