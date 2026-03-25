package com.cc._transient_keyword;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Users implements Serializable{

	private int userId;
	private String userName;
//	private String password;
	private transient String password;
//	static private transient String password;
//	private transient final String password;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	Users(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}	
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		//ENCRYPTION ALGO
		String encryptPassword = this.password + "@123";
		oos.writeObject(encryptPassword);
	}
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		//DECRYPTION ALGO
		String decryptPassword = (String) ois.readObject();
		System.out.println("decryptedPassword = "+decryptPassword);
		decryptPassword = decryptPassword.substring(0 , decryptPassword.length() - 4);
		password = decryptPassword;
	}
}
