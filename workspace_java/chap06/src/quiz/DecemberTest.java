package quiz;

import java.util.Scanner;
import java.util.ArrayList;

//반복되는 부분을 메소드로 만들기 위해 MakeCafe 클래스 생성
class MakeCafe {
	Scanner scan = new Scanner(System.in);
	
	
	// 첫 화면 welcome 메소드
	void welcome() {
		System.out.println("-------------------------------");
		System.out.println("빽휴먼메가포즈커피에 어서오세요");
		System.out.println("-------------------------------");
		System.out.println("메뉴를 선택해 주세요.");		
		System.out.println("1. 아메리카노 | 2. 라떼 | 3. 에이드 | 4. 스무디 | 5. 장바구니 | 6. 종료");
	}
	
	
	// 뒤로가기 선택지를 띄우는 goMain 메소드
	void goMain(){
		System.out.println("4. 메인으로 가기");
		System.out.println("5. 프로그램 종료");
		}

	
	// 선택한 메뉴가 맞는지 확인하는 repeat 메소드
	void repeat() {
		System.out.println("맞으면 1번, 뒤로 돌아가길 바라면 2번을 눌러주세요.");
		int select = scan.nextInt();
		if (select == 1) {
			System.out.println("주문이 완료되었습니다. 잠시만 기다려주세요.");
		}
		else if (select == 2) {
			System.out.println("취소를 선택하셨습니다. 메인 화면으로 돌아갑니다.");
		} else {
			this.error();
		}
	}
	
	
	// 고객이 다른 값을 입력했을 때 안내하는 error 메소드
	void error() {
		System.out.println("올바른 값을 입력해 주세요.");
	}
	
}


public class DecemberTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// MakeCafe 메소드를 호출하기 위한 cafe 객체 생성
		MakeCafe cafe = new MakeCafe();
		Scanner scan = new Scanner(System.in);
		String hotCold = null;
		
		
		// 메뉴 분류별로 배열 생성
		String[] menuAmc = 
			{"아라비카", "로부스타", "리베리카"};
		String[] menuLatte = 
			{"바닐라 라떼", "녹차 라떼", "초코 라떼"};
		String[] menuAde = 
			{"레몬 에이드", "자몽 에이드", "청포도 에이드"};
		String[] menuSmt = 
			{"요거트 스무디", "블루베리 스무디", "망고 스무디"};
		
		
		// 가격 배열 생성
		int[] priceAmc = 
			{3000, 3500, 3200};
		int[] priceLatte = 	
			{3500, 3800, 3500};
		int[] priceAde = 	
			{3500, 3200, 3800};
		int[] priceSmt =  	
			{3500, 4000, 3800};
		
		// 장바구니 배열 (선택하는 만큼 추가)
		ArrayList<String> cartMenu = new ArrayList<>();
		ArrayList<Integer> cartPrice = new ArrayList<>();

		
		while (true) {
		cafe.welcome();
		int select = scan.nextInt();
		int total = 0;

		
		if (select == 1) { // 아메리카노 메뉴 선택 시
			System.out.println("아메리카노 상세 메뉴를 선택해 주세요.");
			for (int i = 0; i < 3; i++) {
				System.out.println((i + 1) + ". " + menuAmc[i] + " " + priceAmc[i] + "원");
			}
			cafe.goMain();
			select = scan.nextInt();

			// 세부 메뉴 선택
			if (select == 1 || select == 2 || select == 3) {
			// "이거 주문한 거 맞으시져 고객님?"
			System.out.println(menuAmc[(select - 1)] + "을(를) 선택하셨습니다." 
			+ "가격은 " + priceAmc[(select - 1)] + "원입니다.");
			System.out.println("맞으면 1번, 뒤로 돌아가길 바라면 2번을 눌러주세요.");
			int check = scan.nextInt();
			if (check == 1) {
				System.out.println("메뉴가 장바구니에 추가 되었습니다.");	
				String myMenu = menuAmc[select - 1]; //장바구니 추가
				int myPrice = priceAmc[select - 1];
				cartMenu.add(myMenu);
				cartPrice.add(myPrice);
			}
			else if (check == 2) {
				System.out.println("취소를 선택하셨습니다. 메인 화면으로 돌아갑니다.");
			}
			}
			 else if (select == 4) {
				System.out.println("메인 화면으로 돌아갑니다.");
				continue; // 메인 화면
			} else if (select == 5) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
	}
	
		else if (select == 2) { // 라떼 메뉴 선택 & 반복
			System.out.println("라떼 상세 메뉴를 선택해 주세요.");
			for (int i = 0; i < 3; i++) {
				System.out.println((i + 1) + ". " + menuLatte[i] + " " + priceLatte[i] + "원");
			}
			cafe.goMain();
			select = scan.nextInt();
			if (select == 1 || select == 2 || select == 3) {
				System.out.println(menuLatte[(select - 1)] + "을(를) 선택하셨습니다." 
				+ "가격은 " + priceLatte[(select - 1)] + "원입니다.");
				System.out.println("맞으면 1번, 뒤로 돌아가길 바라면 2번을 눌러주세요.");
				int check = scan.nextInt();
				if (check == 1) {
					System.out.println("메뉴가 장바구니에 추가 되었습니다.");	
					String myMenu = menuLatte[select - 1]; //장바구니 추가
					int myPrice = priceLatte[select - 1];
					cartMenu.add(myMenu);
					cartPrice.add(myPrice);
				}
				else if (check == 2) {
					System.out.println("취소를 선택하셨습니다. 메인 화면으로 돌아갑니다.");
				} 
			}else if (select == 4) {
				System.out.println("메인 화면으로 돌아갑니다.");
				continue;
			} else if (select == 5) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
		
		else if (select == 3) { // 에이드 메뉴 선택
			System.out.println("에이드 상세 메뉴를 선택해 주세요.");
			for (int i = 0; i < 3; i++) {
				System.out.println((i + 1) + ". " + menuAde[i] + " " + priceAde[i] + "원");
			}
			cafe.goMain();
			select = scan.nextInt();
			if (select == 1 || select == 2 || select == 3) {
				System.out.println(menuAde[(select - 1)] + "을(를) 선택하셨습니다." 
				+ "가격은 " + priceAde[(select - 1)] + "원입니다.");
				System.out.println("맞으면 1번, 뒤로 돌아가길 바라면 2번을 눌러주세요.");
				int check = scan.nextInt();
				if (check == 1) {
					System.out.println("메뉴가 장바구니에 추가 되었습니다.");	
					String myMenu = menuAde[select - 1]; //장바구니 추가
					int myPrice = priceAde[select - 1];
					cartMenu.add(myMenu);
					cartPrice.add(myPrice);
				}
				else if (check == 2) {
					System.out.println("취소를 선택하셨습니다. 메인 화면으로 돌아갑니다.");
				}
			}else if (select == 4) {
				System.out.println("메인 화면으로 돌아갑니다.");
				continue;
			} else if (select == 5) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
		else if (select == 4) { // 스무디 메뉴 선택
			System.out.println("스무디 상세 메뉴를 선택해 주세요.");
			for (int i = 0; i < 3; i++) {
				System.out.println((i + 1) + ". " + menuSmt[i] + " " + priceSmt[i] + "원");
			}
			cafe.goMain();
			select = scan.nextInt();
			if (select == 1 || select == 2 || select == 3) {
				System.out.println(menuSmt[(select - 1)] + "을(를) 선택하셨습니다." 
				+ "가격은 " + priceSmt[(select - 1)] + "원입니다.");
				System.out.println("맞으면 1번, 뒤로 돌아가길 바라면 2번을 눌러주세요.");
				int check = scan.nextInt();
				if (check == 1) {
					System.out.println("메뉴가 장바구니에 추가 되었습니다.");	
					String myMenu = menuSmt[select - 1]; //장바구니 추가
					int myPrice = priceSmt[select - 1];
					cartMenu.add(myMenu);
					cartPrice.add(myPrice);
				}
				else if (check == 2) {
					System.out.println("취소를 선택하셨습니다. 메인 화면으로 돌아갑니다.");
				}
			}else if (select == 4) {
				System.out.println("메인 화면으로 돌아갑니다.");
				continue;
			}else if (select == 5) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		} 
		else if (select == 5) { // 장바구니
			System.out.println("모든 품목의 가격은, ");
			for(int i = 0; i < cartMenu.size(); i++) {
				total += cartPrice.get(i);
				System.out.println(total + "원입니다.");
			}
			
		} 
			
		else if (select == 6) { // 종료
			System.out.println("프로그램을 종료합니다.");
			return;
		} else {
			cafe.error();
		}
		} 
	}
}

		
		