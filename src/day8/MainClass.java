package day8;

public class MainClass {

	public static void main(String[] args) {
//		ICICIBank icici = new ICICIBank();
//		icici.deposit();
//		icici.withdraw();
//		
//		HDFCBank hdfc = new HDFCBank();
//		hdfc.deposit();
//		hdfc.withdraw();
		
		//We cannot create object of an interface
		RBI rbi = new ICICIBank();//possible
		rbi.deposit();
		rbi.withdraw();
		
		rbi = new HDFCBank();
		rbi.deposit();
		rbi.withdraw();
		
		
		//WebDriver - Interface - features
		//ChromeDriver/FirefoxDriver/SafariDriver/InternetExplorerDriver - Class
		//xyz browser - implement the webdriver
	/*
	 * ChromeDriver driver = new ChromeDriver();
	 * WebDriver driver = new ChromeDriver();
	 * 
	 * driver = new FirefoxDriver()
	 * 
	 * 
	 * 
	 */
		
//		ChildClass cc = new ChildClass();
//		cc.abc();
//		cc.xyz();
//		cc.qwe();
		
		AbstractClassDemo ab = new ChildClass();
		ab.abc();
		ab.xyz();
		ab.qwe();
	}

}
