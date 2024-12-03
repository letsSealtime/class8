package sec01.exam01;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1 : 커피, 2 : 홍차, 0 : 종료");
//		Scanner scan = new Scanner(System.in);
//		int menu = scan.nextInt();
//		
//		if (menu == 1) {
//			System.out.println("커피 드릴게여~");
//		} else if (menu == 2) {
//			System.out.println("홍차 드릴게여~");
//		} else if (menu == 0) {
//			System.out.println("다음에 또 오세여~");
//		} else {
//			System.out.println("메뉴에서 골라주세여~");
//		}
//			
//		
//		if (menu != 0) {
//			if (menu == 1) {
//				System.out.println("커피 드릴게여~");
//			} else if (menu == 2) {
//				System.out.println("홍차 드릴게여~");
//			} else if (menu == 0) {
//				System.out.println("다음에 또 오세여~");
//			} else {
//				System.out.println("메뉴에서 골라주세여~");
//			}
////			int menu = scan.nextInt();
//		} else {
//			System.out.println("다음에 또 오세여~");
//		}
//		
	
//		Scanner scan = new Scanner(System.in);
//		int menu = scan.nextInt();
//		
//		while (menu != 0) {
//			if (menu == 1) {
//				System.out.println("커피 드릴게여~");
//			} else if (menu == 2) {
//				System.out.println("홍차 드릴게여~");		
//			} else {
//				System.out.println("메뉴에서 골라주세여~");
//			}
//				
//				System.out.println("메뉴를 고르세요");
//				System.out.println("1 : 커피, 2 : 홍차, 0 : 종료");
//				menu = scan.nextInt();
//			}	
//			System.out.println("다음에 또 오세여~");	
	
	
	// 보통 몇 번 반복할지 모를 때, while (키오스크 언제 끝날지 모를 때)
	// 몇 번 반복할지 알 때, for을 쓴다.
			
		
//			System.out.println("무슨 계절을 가장 좋아하시나여?");
//			Scanner scan = new Scanner(System.in);
//			String season = scan.nextLine();
//			
//			do {	
//				if (season.equals("봄")) {
//					System.out.println("와 저도요~");
//				}
//					else if (season.equals("여름")) {
//					System.out.println("와 저도요~");
//				}
//					else if (season.equals("가을")) {
//					System.out.println("와 저도요~");
//				}
//					else if (season.equals("겨울")) {
//					System.out.println("와 저도요~");
//				} 	else {
//					System.out.println("계절 이름을 적어주세요~");
//				}
//			
//				System.out.println("무슨 계절을 가장 좋아하시나여?");
//				season = scan.nextLine();
//				
//			} while (!season.equals("끝"));
			
			int tu = 0;
			while (true) {
				int num = (int)(Math.random()*6) +1;
				System.out.println(num);
			
				if (num == 6) {
					break;
				}
				tu ++; // 6을 제외하고 숫자를 센다.
			System.out.println("프로그램 종료");
				}	
			System.out.println(tu + "번 굴렸어요~");
			
			
			for (int k = 0; k<5; k++) {
				System.out.println("k의 값 : " + k);
				
				for (int j = 0; j<3; j++) {
					if (j >= 2) {
						break;
					}
					System.out.println("j의 값 : " + j);
				}
				System.out.println( );
			} 
		
			boolean isStop = false;
			for (int k = 0; k<5; k++) {
				System.out.println("k의 값 : " + k);
				
				for (int j = 0; j<3; j++) {
					if (j >= 2) {
						isStop = true;
						break;
					}
					System.out.println("j의 값 : " + j);
				} 
					if(isStop) {
						break;
					}
				System.out.println( );
			} 
			
			for (int s = 1; s <= 10; s ++) {
				if (s % 2 == 0) { // 짝수
					System.out.println(s);
				}
			}
			
			
			for (int s = 1; s <= 10; s ++) {
				if (s % 2 == 0) { // 홀수
					continue ;
				}
					System.out.println(s);
				}
			
		/* 
		 * 1. 예금
		 * 예금액이 음수는 안 된다.
		 * 
		 * 2. 출금
		 * 출금액이 음수는 안 된다.
		 * 잔고보다 큰 금액 출금 불가
		 * 
		 * 3. 잔고
		 * */
			
			
		// while (run)
		//	{1234 
		// button 
		//	if a = 1 else 
		//	예금액을 입력하세요.
		// if boolean true break "프로그램 종료
			
	boolean run = true; 
	int balance = 0;
	
	
	while (run) {
		
		System.out.println("-----------------");
		System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
		System.out.println("-----------------");
		
		Scanner scan = new Scanner(System.in);	
		int credit = scan.nextInt();
		
		if (credit == 1) {
			System.out.println("선택 > 1");
			System.out.println("예금액을 입력하세요.");
			credit = scan.nextInt();
			System.out.println("예금액 >" + credit);
			if (credit >= 0) { 
				balance += credit;
					}
			
		}
		else if (credit == 2) {
			System.out.println("선택 > 2");
			System.out.println("출금액을 입력하세요.");
			credit = scan.nextInt();
			System.out.println("출금액 >" + credit);
				if (credit >= 0) { 
			balance -= credit;
				}
		
		}
		else if (credit == 3) {
			System.out.println("선택 > 3");
			System.out.println("잔고 >" + balance);
			
		}
		
		else if (credit == 4) {
			System.out.println("선택 > 4");
			System.out.println("프로그램 종료.");
			break;
		}
		
	}
	
			
			
			
			
	}	
	}
