package com.cc._file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File f1 = new File("FileDemo.txt");
		f1.createNewFile();
		System.out.println(f1.exists());
		
		/*File f = new File("ex.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		
		File f2 = new File(f , "ex.txt"); 
		System.out.println(f2.exists());*/
	}

}
