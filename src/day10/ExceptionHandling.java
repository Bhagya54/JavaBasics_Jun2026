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
		 * Exception - 
		 * Compiler time  - File Not Found
		 * run time 
		 * 
		 * library - abc - Arabic
		 * 
		 */
		
		File f = new File("./src/day10/demo1");
		FileReader fr = new FileReader(f);
		System.out.println((char)fr.read());//corrupted

	}

}
