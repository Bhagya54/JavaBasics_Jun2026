package day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyDemo {

	public static void main(String[] args) {
		try {
		File f = new File("./src/day10/demo1");
		FileReader fr = new FileReader(f);
		System.out.println((char)fr.read());
		
		}
		catch(Exception e) {
			System.out.println("Please check for the file");
		}
		
		finally {
			System.out.println("Closing the file");
		}

	}

}

/*
 * Login to Bank account
 * Bal- 20K
 * if you  have - transfer - exception
 * Logout 
 * 
 */
