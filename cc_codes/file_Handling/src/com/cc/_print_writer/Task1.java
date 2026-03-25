package com.cc._print_writer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task1 {

	public static void main(String[] args) throws IOException {

		PrintWriter writer = new PrintWriter(new FileWriter("File1.txt"));
		
		writer.println("AAA");
		writer.println("BBB");
		writer.println("CCC");

		writer.flush();
		writer.close();
		
		writer = new PrintWriter(new FileWriter("File2.txt"));
		
		writer.println(111);
		writer.println(222);
		writer.println(333);
		
		writer.flush();
		writer.close();
		
		writer = new PrintWriter(new FileWriter("Target.txt"));
		BufferedReader reader = new BufferedReader(new FileReader("File1.txt"));
		
		String line = reader.readLine();
		while(line != null) {
			writer.println(line);
			line = reader.readLine();
		}
		reader.close();
		
		reader = new BufferedReader(new FileReader("File2.txt"));
		line = reader.readLine();
		while(line != null) {
			writer.println(line);
			line = reader.readLine();
		}
		
		writer.flush();
		writer.close();
		reader.close();
	}
}