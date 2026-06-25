package day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		
		File f = new File("./src/day10/demo1");
		try {
		FileReader fr = new FileReader(f);
		System.out.println((char)fr.read());
		}
		catch(Exception e) {
			System.out.println("Unable to fetch the file or read it");
		}
		System.out.println("After handling");
	}

}
