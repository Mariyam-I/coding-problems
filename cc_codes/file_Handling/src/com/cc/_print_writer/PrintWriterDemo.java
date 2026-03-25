package com.cc._print_writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		
		PrintWriter f1 = new PrintWriter(new FileWriter("fileDemo.txt"));
		
		f1.println("abcd");
		f1.println(1234);
		f1.println(11.54);
		f1.print(true);
		
		f1.close();
	
	}

}
