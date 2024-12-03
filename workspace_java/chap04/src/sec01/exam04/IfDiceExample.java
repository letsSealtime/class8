package sec01.exam04;

import java.util.Scanner;

public class IfDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// random 사용법
		/* Math.random();
		 * 0 <=  Math.random() < 1
		 * 
		 */
		double rand = Math.random();
		System.out.println("rand : " + rand);
		
		/*
		 0 <= Math.random() < 1
		 0*(5+1) <= Math.random()*(5+1) < 1*(5+1)
		 // 0 ~ 5.999999999
		 (int) 0 ~ 5
		 * */
		
		double rand2 = Math.random()*(5+1);
		int rand3 = (int) rand2; // 0~5
		int rand4 = rand3 + 1; // 1~6
		System.out.println("주사위 : " + rand4);
		
		// 쉽게 사용하기
		int rnd1 =  (int)(Math.random() * 60);
		int rnd2 = rnd1 % 6;
		// 숫자를 6 아래로 가두는 방법 (0~5)
		int rnd3 = rnd2 + 1;
		System.out.println(rnd3);
	
		// 3 ~ 6 값
		double wow1 = Math.random()*(3+1);
		int wow2 = (int) wow1; 
		int wow3 = wow2 + 3;
		System.out.println(wow3);
		
		// 가위바위보
		double rsp = Math.random()*4;
		int rsp2 = (int) rsp;
		int rsp3 = rsp2 + 1;
		System.out.print("가위바위보~!");
		if (rsp3 == 1) {
			System.out.println("가위!");
		} else if  (rsp3 == 2) {
			System.out.println("바위!");
		} else {
			System.out.println("보!");
		}s
		
		Scanner scan = new Scanner(System.in);
		String r1 = scan.next();
		String rock = "바위";
		String sci = "가위";
		String pap = "보";
		String win = "이겼습니다!";
		String draw = "비겼습니다!";
		String lose = "졌습니다!";
		
		if (r1.equals(rock) || r1.equals(sci) || r1.equals(pap)) {
			int play = (int)(Math.random()*3)+1;
		
			// 결과값 출력
			
			if (play == 1) {
				System.out.println(rock);
			} else if  (play == 2) {
				System.out.println(sci);
			} else if  (play == 3) {
				System.out.println(pap);
			} 
			
			// 플레이어가 주먹
			if (r1.equals(rock) && play == 1) {
			System.out.println(draw);
			} else if (r1.equals(rock) && play == 2) {
			System.out.println(win);
			} else if (r1.equals(rock) && play == 3) {
			System.out.println(lose);	
			}
			
			// 플레이어가 가위
			else if (r1.equals(sci) && play == 2) {
			System.out.println(draw);
			} else if (r1.equals(sci) && play == 3) {
			System.out.println(win);
			} else if (r1.equals(sci) && play == 1) {
			System.out.println(lose);	
			}
			
			// 플레이어가 보
			else if (r1.equals(pap) && play == 3) {
			System.out.println(draw);
			} else if (r1.equals(pap) && play == 1) {
			System.out.println(win);
			} else if (r1.equals(pap) && play == 2) {
			System.out.println(lose);	
			}
		
		}
		else {
			System.out.println("입력값이 틀렸습니다.");	
		}	
			
//if (player == npc) {
//	System.out.println(비김);} 이런 식으로 줄일 수도 있다.
		
		 
				

	}
}
