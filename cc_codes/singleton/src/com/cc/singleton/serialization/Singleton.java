package com.cc.singleton.serialization;

import java.io.NotSerializableException;
import java.io.Serializable;

//6. implementing Serializable
public class Singleton implements Serializable{

	private static Singleton instance = null;
	
	private Singleton() {
		//no-ops
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	
	private Object readResolve() {

		try {
			throw new NotSerializableException();
			
		} catch(NotSerializableException e) {
			e.printStackTrace();
			System.out.println("Singleton Does not support serialization");
		}
		
		return instance;	
	}
	
}
