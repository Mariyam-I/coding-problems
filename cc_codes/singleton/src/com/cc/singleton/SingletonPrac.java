package com.cc.singleton;

public class SingletonPrac {

	private static SingletonPrac instance = null;

	public SingletonPrac() {
		super();

	}

	public static SingletonPrac getInstance() {
		if (instance == null) {
			synchronized (SingletonPrac.class) {
				if (instance == null) {
					instance = new SingletonPrac();
				}
			}
		}
		return instance;
	}

	// Gives the current thread name and hash code
	public void showMessage() {
		System.out.println("Thread Name = " + Thread.currentThread().getName() + " ---> " + this.hashCode());
	}

}
