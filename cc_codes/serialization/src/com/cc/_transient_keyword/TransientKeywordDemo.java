package com.cc._transient_keyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientKeywordDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Users user1 = new Users(111, "Amit", "Akdfn@rhfbd");
		System.out.println("User1 = "+ user1);
		
		//Serialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Credentials.ser"));
		oos.writeObject(user1);
		
		//De-Serialization
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Credentials.ser"));
		Users user2 = (Users) ois.readObject();
		
		System.out.println("======Serialization Completed========");
		
		System.out.println("User2 = "+user2);
		
		oos.close();
		ois.close();
	}

}


//final & transient also (legal but no impact)


/* 		----------> Before Using trnsient 
User1 = Users [userId=111, userName=Amit, password=Akdfn@rhfbd]
======Serialization Completed========
User2 = Users [userId=111, userName=Amit, password=Akdfn@rhfbd]
*/



/*  	----------> After Using trnsient
User1 = Users [userId=111, userName=Amit, password=Akdfn@rhfbd]
======Serialization Completed========
User2 = Users [userId=111, userName=Amit, password=null]
*/



/*  	----------> static & trnsient (legal but no impact)
User1 = Users [userId=111, userName=Amit, password=Akdfn@rhfbd]
======Serialization Completed========
User2 = Users [userId=111, userName=Amit, password=Akdfn@rhfbd]
*/




/*  ---------> Using decrypted and encrypted technique to hide password while writing into file
User1 = Users [userId=111, userName=Amit, password=Akdfn@rhfbd]
decryptedPassword = Akdfn@rhfbd@123
======Serialization Completed========
User2 = Users [userId=111, userName=Amit, password=Akdfn@rhfbd]
*/