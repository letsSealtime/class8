package sec04.exam04;

public class Calc {

	
	int plus (int x, int y) {
		System.out.println("int int 실행");
		int result = x + y;
		return result;
	}
	
	double plus (int x, double y) {
		System.out.println("int double 실행");
		double result = x + y;
		return result;
	}
	
	
//	int plus (int y, int x) {
//		System.out.println("int int 실행");
//		int result = x + y;
//		return result;
//	} duplicate 오류
	// int, int로 위의 메소드와 전달인자와 타입이 동일
	
	// 오버로딩
	// 1. 전달인자를 신경쓰지 않고 비슷한 수행을 할 수 있게 해주는 기술
		// 1-1. 전달인자의 개수, 타입, 순서 등으로 구분할 수 있어야 한다.
	// 2. 전달인자의 우선순위 
		// 2-1. 정확히 동일한 타입
		// 2-2. 없으면 자동형 변환으로 실행될 수 있는 타입 찾기
	// 3. 전달 인자가 너무 많고, 대부분이 기본값이 있는 경우
	// 전달인자를 줄이는 목적으로도 사용함 (실무팁~)
	
	double plus (double x, double y) {
		System.out.println("double double 실행");
		double result = x + y;
		return result;
	}
	
	double avg (int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute () {
		double result = avg(7,10);
		pp("실행결과 : " + result);
	}
	// pp든 double이든 머가 먼저 나와도 자바가 알아서 쓴다~
	
	void pp(String message) {
		System.out.println(message);
	}
	
	void method(String classDept, int classNum) {
		System.out.println(classDept + "," + classNum);}
	void method() {
		method("천안",1);
	
	}
}
