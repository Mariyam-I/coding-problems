package com.cc._buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("NewBwFile.txt"));

	/*  System.out.println(br.readLine());      this reads only one line 
		System.out.println(br.readLine());
		System.out.println(br.readLine());
	 */		
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		
		br.close();
	}

}
