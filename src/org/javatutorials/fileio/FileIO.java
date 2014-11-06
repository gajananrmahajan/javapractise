package org.javatutorials.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	private static String readFromFile(String fileName) throws IOException {
		String returnValue = "";
		String line = "";
		
		FileReader file = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(file);
			
		while((line = reader.readLine()) != null){
			returnValue += line + "\n";
		}
		
		reader.close();
		
		return returnValue;
	}

	private static void writeToFile(String fileName, String toWrite) throws IOException{
		FileWriter output = new FileWriter(fileName);
		BufferedWriter writer = new BufferedWriter(output);

		writer.write(toWrite);
		writer.close();
	}
	
	public static void main(String[] args) throws IOException {
		String fileName = System.getProperty("user.dir") + "\\testdata\\toread.txt";
		System.out.println(readFromFile(fileName));
		
		String fileToWrite = System.getProperty("user.dir") + "\\testdata\\towrite.txt";
		File file = new File(fileToWrite);
		String toWrite = "This is to write to a file. Goodbye!";
		
		writeToFile(fileToWrite, toWrite);
		
	}

}
