package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asssignment {
	
	public static int searchTarget(int noOfValue,int[] arr,int searchValue) {
		for(int a:arr) {
			if(a==searchValue) {
				return 1;
			}
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		int[] arr1 = {12,34,67,100};
		if(searchTarget(4,arr1,67)==1) {
			System.out.println("Value is present in the array");
		}
		else {
			System.out.println("Not Present");
		}
		
	}

}
