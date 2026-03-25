package com.cc._file_reading;

import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader read1 = new FileReader("MyFile.txt");
		
		char[] crr = new char[1000];
		read1.read(crr);
		
		for(char c : crr) {
			System.out.print(c);
		}
		read1.close();
	}

}
