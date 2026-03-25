package com.cc._file_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {

	public static void main(String[] args)  throws IOException {

		File f1 = new File("NewFile.txt");
	
		f1.createNewFile();
		
		//true to append the the data in file to avoid overriding bcoz it is false by default 
		FileWriter write1 = new FileWriter(f1, true);
		
		write1.write("\nM");
		write1.write("\nA");
		write1.write("\nR");
		write1.write("\nI");
		write1.write("\nY");
		write1.write("\nA");
		write1.write("\nM");
		write1.write("\n");
		
		write1.write("New file Created for writing.");
		
		write1.close();
		System.out.println("Writing Completed");
	}

}
