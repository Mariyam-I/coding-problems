package com.cc.singleton.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println("S1 Hashcode = " + s1.hashCode());
		System.out.println("S2 Hashcode = " + s2.hashCode());
		System.out.println("S3 Hashcode = " + s3.hashCode());
		
		//Serialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Serialize.ser"));
		oos.writeObject(s1);
		
		//De-Serialization
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Serialize.ser"));
		Singleton obj = (Singleton) ois.readObject();
		
		System.out.println("De-Serialized object : " + obj.hashCode());

		oos.close();
		ois.close();
	}

}




/*


Serialization and deserialization can pose a challenge to the Singleton design pattern in Java. 
The Singleton pattern ensures that only one instance of a class exists throughout the application.
However, if a Singleton class implements the Serializable interface, deserialization can lead to the creation of a new instance,
thus breaking the Singleton principle.

 ------------>>> The Issue:

When a serialized Singleton object is deserialized, the readObject() method, by default,
creates a new instance of the class and populates its fields from the serialized data. 
This results in a second instance of the Singleton class, violating the core principle of the pattern.

------------>>> The Solution: readResolve() Method

To maintain the Singleton pattern during deserialization, 
the readResolve() method must be implemented in the Singleton class. 
This method is a special hook that the Java Serialization mechanism calls during deserialization.

------------>>> How readResolve() Works:

1- When a serialized object is deserialized, the JVM first creates a new instance of the class.
2- If the class implements readResolve(), the JVM then calls this method on the newly created instance.
3- The readResolve() method should return the existing Singleton instance, 
   typically by calling the getInstance() method of the Singleton class.
4- The JVM then discards the newly created instance and uses the instance returned by readResolve(). 
   This ensures that only the original Singleton instance is ever used, even after deserialization.


































*/