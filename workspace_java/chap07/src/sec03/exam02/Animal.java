package sec03.exam02;

public abstract class Animal {

	String kind;
	
	Animal(String name){
		
	}
	
	void breathe() {
		System.out.println("숨숴 숨숴");
	}
	
	// 추상 메소드
	// abstract가 붙은 메소드
	// 실행 블럭 {} 이 있으면 안 된다.
	// 나는 구현하지 않음.
	// 대신, 나를 상속받은 자식이 꼭! 구현해야한다.
	abstract void sound();

}
