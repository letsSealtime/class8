package sec01.exam01;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 2;
		
		switch (num) {
		case 1 : 
			System.out.println("1입니다.");
			break;
		case 2 : 
			System.out.println("2입니다.");
			break;
		default : 
			System.out.println("3입니다.");
			break;
		}
		
		int month = 11;
		switch (month) {
		case 1 :
			System.out.println("겨울");
			break;
		case 10 :
//			System.out.println("가을");
//			break;
			// 9~11 값을 입력하고 싶을 때 case를 연달아,
			// break를 안 주는 방법도 있다.
		case 11 :
			System.out.println("가을");
			break;
		case 12 :
			System.out.println("겨울");
			break;
	// case의 값은 모두 달라야 한다.
		}
		
	// 통장 잔액이 10000원 있을 때
	// 출금액을 입력 받아서
	// "잔액이 부족합니다."
	// "얼마 출금했고 얼마 남았습니다."
	// 음수일 경우 "정확히 입력해 주세요."
		
	int bal = 10000;
	Scanner scan = new Scanner(System.in);
	int out = scan.nextInt();
	int bal2 = bal - out;
	
	// 입력액이 음수, 양수인지
	// bal2가 음수면 잔액이 부족, bal2가 양수면 얼마 출금
	if (out > 0) {
			if (bal2 < 0) {
			System.out.println("잔액이 부족합니다.");
			} else if (bal2 >= 0) {
	// b -= w; 앞에 적어보자~ 그럼 저장이 되니까! 
			System.out.println(out + "원 출금했고, " + bal2 + "원 남았습니다.");
			}
		}
		else if (out < 0) {
		System.out.println("당신은 고릴라입니까? 금액을 정확히 입력해 주세요.");
	 	}
	
}
}
