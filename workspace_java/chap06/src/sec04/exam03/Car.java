package sec04.exam03;

public class Car {

	int gas = 5;
	// 필드
	// 같은 말로 멤버(메소드&필드를 말한다.) 변수
	// 클래스를 생성(new 하는 순간) 생성과 함께 생성된다.
	// 클래스가 소멸 시(가베지 컬렉터 동작)까지 생존.
	// 그 동안 메모리를 차지하면서, 계속 저장된 값이 유지된다.
	// 가능하면 지역변수로 먼저 해결하는 게 좋다.
	// 클래스 자체의 값을 저장하거나
	// 메소드끼리 공유하는 목적으로 사용하거나
	// (아껴씁시다. 메모리 낭비다. 대신 지역변수로 사용하자)
	
	int speed;
	// 값을 선언하지 않은 경우,
	// 0, false, null로 초기화 된다.
	
	void setSpeed(int s) {
		speed = s;
	}
	
	// 메소드는 무조건 return을 해야만 한다.
	// 단void의 경우 생략할 수 있다.
	void setGas (int g) {
		gas = g;
		// return;
	}
	
	// 만약 주석을 단다면 
	// gas의 값이 0이면 false를 
	// 그렇지 않으면 true를 돌려주는 함수
	boolean isLeftGas() {
		boolean result = false;
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; //return 하는 순간 메소드 종료!
		} else {
			// else가 있는 if의 분기는 무조건
			// 하나의 return을 보장한다.
		System.out.println("gas가 있습니다.");
		return true;
		}
	}
	
	boolean isLeftGas2() {
		boolean result = false;
		
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			 result = false;
		} else {
		System.out.println("gas가 있습니다.");
		 result = true;
		}
		 return result;
		// return을 한 번만 하는 방식
	}
	
	boolean isLeftGas3() {
			return gas != 0;
		}
		// 난 더 줄 임
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas잔량 : " + gas + ")");
				setSpeed(gas)
			} else {
				System.out.println("멈춥니다. (gas잔량 : " + gas + ")");
				return; }
		}
	}
//	System.out.println("정차 알고리즘 실행");
	
}
	
