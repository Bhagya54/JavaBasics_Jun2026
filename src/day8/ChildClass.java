package day8;

public class ChildClass extends AbstractClassDemo {

	@Override
	public void abc() {
		System.out.println("abc method implemented in child class");
		
	}

	@Override
	public void qwe() {
		System.out.println("qwe method implemented in child class");
		
	}
	
	public void xyz() {
		System.out.println("XYZ implemented inside child class");
	}

}
