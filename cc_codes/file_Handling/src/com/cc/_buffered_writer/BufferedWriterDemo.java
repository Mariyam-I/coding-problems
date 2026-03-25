package com.cc._buffered_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("NewBwFile.txt", true));
		
		/*bw.write("Hello");
		bw.newLine();
		bw.write("welcome to");
		bw.newLine();
		bw.write("Java coding");
		bw.newLine();*/
		
		bw.newLine();
		bw.write("Buffered Writer");
		bw.newLine();
		bw.write(100);	 //character d is printing 
		bw.newLine();
		bw.write("70");  //if numbers are in quotation then it will print number only
//		bw.write(true);  The method write(int) in the type BufferedWriter is not applicable for the arguments (boolean)
//		bw.write(12.5);  The method write(int) in the type BufferedWriter is not applicable for the arguments (double)
		
		bw.close();
	}

}
