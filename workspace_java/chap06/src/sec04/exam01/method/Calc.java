package sec04.exam01.method;

public class Calc {
	
	// 전원, false : 꺼짐, true : 켜짐
	boolean isOn = false;
	
	// 전원을 켜는, 
	// isOn = true로 바꿔주는 메소드 선언
	
	void powerOn() {
		isOn = true;
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		isOn = false;
		System.out.println("전원을 끕니다.");
	}
		/** 
		 * 더하기 기능
		 * 두 수를 입력 받아서 결과를 돌려줌
		 * 
		 * 메소드 명 : plus
		 * 전달인자 : int, int
		 * 리턴 타입 : int (두 수의 합)
		 * 
		 * @param : int x, int y
		 * @return : int
		 * @author : SealKim
		 */
		
		int plus(int x, int y) {
			System.out.println("x : " + x);
			System.out.println("y : " + y);
			
			int result = x + y;
			return result;
		}
		
		/**
		 * 두 정수를 받아서 나누기한 결과를 돌려준다.
		 * 메소드명 : divide
		 * 전달인자 : double, double
		 * 리턴타입 : double (두 수의 나누기)
		 * 
		 *  @param : double x, double y
		 *  @return : double
		 *  @author : SealKim
		 *  
		 *
		 */
		
			
			double divide(double x, double y) {
				System.out.println("x : " + x);
				System.out.println("y : " + y);
			
				double result = 0;
				
				if (y == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
				} else {
					result = x / y;
				}
				
				return result;
				
			}
			
		// 배열을 전달할 때 얕은 복사에 관하여
		int sum1(int ... values) {
			int sum = 0;
			for(int i = 0; i < values.length; i++) {
				sum += values[i];
			}
				return sum;		
			}
			
		// ...
		// 다른 곳에서 사용할 때 : sum2(1,2,3,4)
		// 내부에서 사용할 때 values는 배열 취급
		int sum2(int ... values) {
			int sum = 0;
			for(int i = 0; i < values.length; i++) {
			sum += values[i];
			}
			return sum;
		}
		
	}

