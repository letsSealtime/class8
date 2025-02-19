package sec02.exam01;

public class Cat extends Animal {

	int age;
	
	
	@Override
	void sound() {
		System.out.println("야옹");
	}
	
	@Override
	void eat() {
		System.out.println("츄릅츄릅");
	}
	
	void push() {
		System.out.println("꾹꾹이합니다.");
	}
	
	
}
