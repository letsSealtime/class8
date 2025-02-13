package sec05.exam02_static;

public class Calc {
	String color;
	static double pi = 3.14;
	
	static void printPi() {
		System.out.println("pi : " + pi);
	}
	
	static void printColor() {
//		System.out.println("color : " + color);
	}
	
	static Print out = new Print();
	
	void printPi2() {
		System.out.println("pi : " + pi);
	}
}
