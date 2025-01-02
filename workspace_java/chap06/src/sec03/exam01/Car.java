package sec03.exam01;

public class Car {

	
	String brand = "아반떼";
	String color = null;
	int cc = 0; // 강조
	
//	System.out.println ("안됨. 메소드라");

	// 클래스를 new로 생성할 때
	// 1. 필드 먼저 선언됨
	// 2. 생성자 실행 
	
	// 생성자도 오버로드를 지원한다.
	
	Car(int c) {
		cc = c;
		color = "흰색";
		System.out.println("Car() 생성");
		test();
	}
	
	Car () {
		this("아반테", "흰색", 1300);
	System.out.println("아무것도 없는 생성자 실행");	
	}
	// 아무것도 넣지 않은 생성자
	
	Car(String b){
		brand = b;
		System.out.println("Car(String) 생성 : " + brand);
	}
	
	Car (String b, String c, int cc2){
//		this(); // 다른 생성자 호출. Car() 자기자신 호출
				//this는 무조건 첫번째 줄에서 호출해야 한다.
		brand = b;
		color = c;
		cc = cc2;
		System.out.println("Car(String b, String c, int cc2) 생성 : " + brand);
	}

	Car (String brand, int cc){
		
		String color = "파랑";
		System.out.println(color);
		System.out.println(this.color); // 필드를 뜻한다.
		
		this.brand = brand;
		this.cc = cc;
	}
	
	
	void setBrand(String brand) {
		this.brand = brand;
	}
	
	void test() {
		System.out.println("test() 실행");
	}
	
	void init () {
		brand = "아반떼";
		color = "흰색";
		cc = 1300;
	}
	// 생성자에서 메소드를 넣을 수는 있으나, 메소드에서 생성자 호출은 불가
	
	// 기본 생성자
// 메소드는 메소든데 타입도 몰라, 아무것도 없음
//	클래스를 생성할 때(= 객체, java에서 좁은 의미로는 클래스)
//	즉, new할 때 무조건 실행되는 메소드의 일종.
//	리턴타입이나 return문은 쓰지 않는다.
//	이유는 무조건 생성된 heap 영역의 주소를 돌려주기 때문에 고정값이라서.
//	메소드 명에 해당하는 이름은 무조건 클래스 이름이어야 한다.
//	**즉, 리턴 타입이 없고 메소드 명이 클래스 명과 동일한 경우 생성자라고 한다.**
//	**기본 생성자 :** 전달인자와 실행 내용이 없는 생성자. 
//	기본 생성자는 생략 가능하다.
//	즉, 생성자를 적지 않으면 기본 생성자가 자동완성된다.


}
