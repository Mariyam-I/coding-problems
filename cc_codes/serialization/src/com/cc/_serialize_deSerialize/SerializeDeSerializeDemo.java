package com.cc._serialize_deSerialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDeSerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee e1 = new Employee(101, "Steve", 25000.25);
		System.out.println(e1);
		System.out.println("------Before Serialization-------");
		
		FileOutputStream fos = new FileOutputStream("emp1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		
		System.out.println("--------------Serialization Completed Successfully-----------");
		
		FileInputStream fis = new FileInputStream("emp1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e2 = (Employee) ois.readObject();
		
		System.out.println("------After Serialization-------");
		System.out.println(e2);
		
		System.out.println(e1.hashCode() + "  " + e2.hashCode());
		
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
		
		oos.close();
		ois.close();
	}

}



/*
Employee [empId=101, empName=Steve, empSalary=25000.25]
------Before Serialization-------
--------------Serialization Completed Successfully-----------
------After Serialization-------
Employee [empId=101, empName=Steve, empSalary=25000.25]
*/
		