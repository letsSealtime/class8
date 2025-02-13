package sec05.exam01;

public class Car {
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	// 메소드명 : printModel
	// 하는 일 : 필드의 model을 출력
	
	void printModel() {
		System.out.println("모델 출력 : " + this.model);
	}
}
