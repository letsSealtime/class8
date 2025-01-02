package quiz;

public class Calc {

	// + - * / %
	// 각각 메소드 만들기
	
	double result;
	
	double plus(double x, double y) {
		result = x + y;
		return result;
	}
	
	double minus(double x, double y) {
		result = x - y;
		return result;
	}
	
	double multiply(double x, double y) {
		result = x * y;
		return result;
	}
	
	double divide(double x, double y) {
		if (y != 0) {
			result = x / y;
			return result;
		} else {
			System.out.println("0이 아닌 수를 입력하시오.");
			result = 0;
			return result;
		}
	}
	

	/**
	 * compute
	 * 사칙연산 및 간단한 계산을 수행
	 * 
	 * @param double x, String math, double y
	 * 
	 * */
	
	double compute(double x, String math, double y) {
		if (math.equals("+")) {
			return plus(x, y);
		}
		else if (math.equals("-")) {
			return minus(x, y);
		}
		else if (math.equals("*")) {
			return multiply(x, y);
		}
		else if (math.equals("/")) {
			return divide(x, y);
		}
		else {
			System.out.println("잘못된 연산자입니다.");
			return 0;
		}
	}
	
	
	
	
}
