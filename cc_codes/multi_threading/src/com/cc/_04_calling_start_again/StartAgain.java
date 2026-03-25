package com.cc._04_calling_start_again;

public class StartAgain extends Thread{

	@Override
	public void run() {
			for(int i = 1; i<= 10; i++) {
				System.out.println(i+" ------> Child Thread");
			}
	}
	
}
