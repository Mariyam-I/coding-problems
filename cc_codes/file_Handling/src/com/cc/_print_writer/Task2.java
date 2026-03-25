package com.cc._print_writer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task2 {

	public static void main(String[] args) throws IOException {

	PrintWriter writer = new PrintWriter(new FileWriter("Target1.txt"));
	
	BufferedReader reader = new BufferedReader(new FileReader("File1.txt"));
	BufferedReader reader1 = new BufferedReader(new FileReader("File2.txt"));
	
	String line = reader.readLine();
	String line1 = reader1.readLine();
	
	while(line != null || line1 != null) {
		if(line != null) {
			writer.println(line);
			line = reader.readLine();
		}
		if(line1 != null) {
			writer.println(line1);
			line1 = reader1.readLine();
		}
	}
	
	writer.flush();
	reader.close();
	reader1.close();
	writer.close();
	
	}

}
