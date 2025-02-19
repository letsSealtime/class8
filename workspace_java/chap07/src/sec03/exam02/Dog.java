package sec03.exam02;

public class Dog extends Animal {
	
	Dog(){
		super(null);
	}
	
	@Override
	void sound() {
		System.out.println("멍멍");
	}
	
	String name;
	
	void name(String name) {
		this.name = name;
	}
}
