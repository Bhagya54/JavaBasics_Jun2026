package day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*IOException
 * FileNotFound 
 */

public class ExceptionHandling {

	public static void main(String[] args) throws IOException {
		/*
		 * Exception - it terminates the program and will not
		 * proceed with further lines of execution
		 * Compiler time  - File Not Found
		 * run time 
		 * 
		 * library - abc - Arabic
		 * 
		 * try - when we keep the risky code
		 * catch - how we want to handle it
		 * throws - declaring an exception
		 * throw - used to throw a new exception
		 * finally - which executes irrespective of exception being occured or not
		 */
		
		File f = new File("./src/day10/demo1");
		FileReader fr = new FileReader(f);
		System.out.println((char)fr.read());//corrupted

	}

}
