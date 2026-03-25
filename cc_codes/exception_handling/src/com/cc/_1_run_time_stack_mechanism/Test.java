package com.cc._1_run_time_stack_mechanism;

public class Test {

	public static void main(String[] args) {
		doSomething();
		System.out.println("Did something");
	}

	public static void doSomething() {
		doSomethingmore();
		System.out.println("Doing something !!");
	}

	public static void doSomethingmore() {
		System.out.println("Doing something more !!");

	}
}
