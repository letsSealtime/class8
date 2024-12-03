package sec01.exam01;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		// 1씩 증가하는 것을 5번 하고싶다.
		sum = sum + 1;
		sum += 1;
		sum += 1;
		sum += 1;
		sum += 1;
		System.out.println("sum : " + sum);
		
		// 반복문을 배웁시다.
		// 1 + 2 + 3 + 4 + 5
		// 1부터 n까지 더하는 공식 : n*(n+1)/2
		// 바뀌는 애들은 패턴을 분석하자.
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println("sum : " + sum);
		
		/*
		 반복문을 만드는 원리
		 
		 1. 반복되는 것 찾기
		 	Ctrl + c, v 했을 때 바뀌지 않는 것
		 	
		 2. 반복되지 않는 것 찾기
		  	규칙(패턴)을 찾을 수 있으면 반복문으로 만들 수 있다.
		 	변수를 활용해서 더 이상 바뀌지 않게 만들기
		 	(언제까지? 손으로 수정하지 않아도 될 때까지)
		 
		 3. 시작 조건
		 
		 4. 종료 조건 
		 for : 반복 횟수를 아는 경우 
		 while : 반복 횟수를 모르는 경우 (ex. 계속 도는 경우)
		 */
		
		int sum2 = 0;
		for (int e = 1; e <= 5; e++) { 
			sum2 = sum2 + e;
		}
		System.out.println("sum2 : " + sum2);
		// e는 지역변수라 다시 선언 가능
		
		int sum3 = 0;
		for (int e = 1; e <= 5; e++) { 
//			System.out.println("e : " + e);
			sum3 = sum3 + e;
//			System.out.println("sum3 : " + sum3);
			//잘 계산이 되고 있는지 한 번씩 확인하기 (한줄씩 나옴)
		}
		System.out.println("sum3 : " + sum3);
		
		// 1~10까지 출력
		for (int bang = 1; bang <= 10; bang++) {
			System.out.println("뺑 : " + bang);
		}
		// bang = bang + 1 적어도 되긔윤

		
		// 1~100까지 합을 출력
		int jo = 0;
		for (int bbang = 1; bbang <= 100; bbang++) {
			jo = jo + bbang;
		}
		System.out.println("조뺑이 치는 중 : " + jo);
		// 넌 친구도 아니다

		// 10~ 1을 출력하시오
		for (int ha = 10 ; ha >= 0; --ha) {
			System.out.println("하 : " + ha);
		}
		// ha =< 10 은 항상 참이니, 적을 필요가 없다.
		
		// 1~20 에서 짝수만 출력하시오
		// 2 4 6 8 10
		
		for (int boreum = 2; boreum <= 20; boreum += 2) {
			System.out.println("보름 : " + boreum);
		}
		
		// 1~20까지 3의 배수만 출력하시오
		
		for (int coke = 3; coke <= 20; coke += 3) {
			System.out.println("콕콕 : " + coke);
		}
		
		// 1~5까지 모두 출력하면서 옆에다가 홀짝을 출력하긔
		
		for (int ho = 1; ho <= 5; ho ++) {
			System.out.print("호호 : " + ho);
				if (ho %2 == 0) {
				System.out.println(" 나는 짝");
			} else {
				System.out.println(" 나는 홀");
			}
		}
		
//		이런 식으로 겹치는 데에는 변수를 조절할 수도 있다.
//		string ea = "홀수";
//		if (ho %2 == 0) {ea = "짝수"}
//		그래서 홀수일 때 때로 else를 적지 않아도 된다.
		
/* 		삼항 연산자 풀이법
 * 		string ae = (ho % 2 ==0 ) ? "짝수" : "홀수"
 *  */
		
		

		// 1~20까지 홀수의 합
		int cider = 0;
		for (int cider2 = 1; cider2 <= 20; cider2 ++) {
			if (cider2 %2 == 1) {
				cider = cider + cider2;
				}
		}	System.out.println("사이다 : " + cider);
			// cider = cider + cider2;
		
		
		// 1~20까지 홀수의 개수 
		for (int melon = 1; melon <= 20; melon += 2) {  
			System.out.print(melon); 
			System.out.println(" : 홀수는 " + (melon/2+1) + "개");
		}
		
		// 1~10까지 옆으로 3개씩 출력 
		// 123 456 789 10
		for (int lala = 1; lala <= 10; lala += 3) {
			System.out.print(lala);
			if ((lala +1) < 10) {
			System.out.print(lala+1);}
			if ((lala +2) < 10) {
			System.out.println((lala+2) + "  ");}
		}
		
//		if (lala % 3 == 0)
//			System.out.println( );
//		이렇게 푸는 것도 방법!
		
		
		System.out.println(" ");
		
		// 구구단 2단 출력
		// 2 x 1 = 2
		// 2 x 2 = 4
		
		int lemon = 2;
		for (int apple = 1; apple <= 9; apple++)
		{	System.out.print(lemon + " x " + apple + " = ");
			System.out.println(lemon*apple);
			}
//		int qq6 = 1
//		System.out.println("2 x " + qq6 + " = " (2*qq6));
//		qq1 변수 하나로만 적을 수 있다. 규칙을 찾자.
		
		// 1부터 n까지 짝수의 합을 구하시오
		
		
		int nq2 = 27;
		int sum8 = 0;
		for (int nq1 = 1; nq1 <= nq2; nq1 ++) {
			if (nq1 %2 == 0) {
				sum8 += nq1;
				}
		}	System.out.println("12월 새 문제: " + sum8);

	
		for (int nnt = 2; nnt <= 9; nnt ++) {
			for (int nnt2 = 2; nnt2 <= 9; nnt2 ++) {
				System.out.print(nnt + "단~ ");
				System.out.println(nnt + "x" + nnt2 + "=" + nnt*nnt2);
			}
		}
		
		System.out.println("=====q1=====");
	// 한 줄에 1단씩 출력
	// 2x1 = 2 2x2 = 4
		
	for (int x1 = 2; x1 <= 9; x1 ++) {
		for (int x2 = 1; x2 <= 9; x2 ++) {
			if (x2 == 1) {
				System.out.println("  ");}
			System.out.print(x1 + "x" + x2 + "=" + x1 * x2 + "  ");
			
		}
	}
	
	System.out.println("  ");
	System.out.println("=========q2=========");

	

	
	// 두 세단 씩 옆으로 출력
	// 2x1 = 2 3x1
			
	System.out.print("2 x 1 = 2");
	System.out.println("3 x 1 = 3");
	
	System.out.print("2 x 2 = 4");
	System.out.println("3 x 2 = 6");
		
	int z1 = 2;
	int z2 = 1;
	System.out.print(z1 * z2);
	z1 ++ ;
	System.out.println(z1 * z2);
	z2 ++; 
	
	
	for (int x1 = 2; x1 <= 9; x1 ++) {	
		 for (int x2 = 1; x2 <= 9; x2 ++) { 
		 System.out.print(x1 + "*" + x2 + "=" + x1 * x2 + " "
				 + (x1+1) + "*" + x2 + "=" + (x1+1) * x2);
		 System.out.println("   ");
		 }

	}
	
	// 1단계
	/*
	 
	 +++++
	 	 
	 */
	
	for (int red = 1; red <= 5; red ++)
	{
			{System.out.print("+");}
	}
	
	// 2단계
	/*
	 
	 +++++
	 +++++
	 +++++

	 */
	for (int red = 1; red <= 15; red ++)
	{
			{System.out.print("+");
			if (red % 5 == 0)
			{System.out.println(" ");}
			}}
	
	// 3단계
	/*
	 
	 + + + + +
	 
	 */
	System.out.println("3단계");
	for (int red = 1; red <= 9; red ++)
	{		
			if (red % 2 == 1)
			{System.out.print("+");}
			else {System.out.print(" ");}
			}
	
	// 4단계
	/*
	 
	 +
	 ++
	 +++
	 ++++
	 +++++
	 
	 */
			
	// 5단계
	/*
	 
	 +____
	 ++___
	 +++__
	 ++++_
	 +++++
	 
	 */

	// 6단계
	/*
	 
	 ____+
	 ___++
	 __+++
	 _++++
	 +++++
	 
	 */

	// 7단계
	/*
	 
	 ____+
	 ___+++
	 __+++++
	 _+++++++
	 +++++++++
	 
	 */

	// 8단계
	/*
	 
	 ____+____
	 ___+++___
	 __+++++__
	 _+++++++_
	 +++++++++


	 
	 */
	System.out.println("8단계");
	
	// 1층
	for (int ca = 4; ca >= 1; ca --)
		{System.out.print("_");}
	 	System.out.print("+");
	for (int ca = 4; ca >= 1; ca --)
		{System.out.print("_");}
	System.out.println("  ");
	
	// 2층
	for (int ca = 3; ca >= 1; ca--)
		{System.out.print("_");}	
	for (int cb = 1; cb <= 3; cb ++)
		{System.out.print("+");}
	for (int ca = 3; ca >= 1; ca--)
		{System.out.print("_");}
	System.out.println("  ");
	
	// 3층
	for (int ca = 2; ca >= 1; ca--)
		{System.out.print("_");}	
	for (int cb = 1; cb <= 5; cb ++)
		{System.out.print("+");}
	for (int ca = 2; ca >= 1; ca--)
		{System.out.print("_");}
	System.out.println("  ");
	
	// 4층
	for (int ca = 1; ca >= 1; ca--)
		{System.out.print("_");}	
	for (int cb = 1; cb <= 7; cb ++)
		{System.out.print("+");}
	for (int ca = 1; ca >= 1; ca--)
		{System.out.print("_");}
	System.out.println("  ");
	
	// 5층
	for (int cb = 1; cb <= 9; cb ++)
		{System.out.print("+");}
	
	System.out.println("9단계");
	// 9단계
	// 입력 받은 만큼 출력
	/// ㄱ-???
	

	
//	 4 + 1 + 4
//	 3 + 3 + 3
//	 2 + 5 + 2
//	 1 + 7 + 1
//	 0 + 9 + 0
//	
//	 2a-1
//	5를 입력했을 때 : 9
//	6을 입력했을 때 : 11
//	7을 입력했을 떄 : 13
//	
//	b = 1
//	(a-1) + b + (a-1)
//	(a-2) + b(++2) + (a-2)
//	(a-3) + b(++2) + (a-3)
//	(a-4) + b(++2) + (a-4)
//	(a-5) + b(++2) + (a-5)
	
	Scanner scan = new Scanner(System.in);
	int a1 = scan.nextInt();
	
	for (int a3 = 1; a3 <= a1; a3++) {
		for (int a2 = a1 -1; a2 >= 1; a2 --)
		{System.out.print("_");
			for (int b = 1; b <= (2*a3)-1; b++)
			{System.out.print("+");}
		for (int a2 = a1 -1; a2 >= 1; a2 --)
		{System.out.print("_");}
		System.out.println("  ");	
		}
	}
		

	
	
	
	
		}
	}
