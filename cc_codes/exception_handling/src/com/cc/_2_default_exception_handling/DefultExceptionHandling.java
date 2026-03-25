package com.cc._2_default_exception_handling;

public class DefultExceptionHandling {

	public static void main(String[] args) {
		doSomething();
		System.out.println(10 / 0);

	}

	public static void doSomething() {
		doSomethingmore();
		System.out.println("Doing something !!");

	}

	public static void doSomethingmore() {
		System.out.println("Doing something more !!");

	}

}
