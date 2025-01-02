package sec01.exam01;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 한 번에 여러 **변수**를 만드는 방법.
		같은 타입만 선언할 수 있다.
		생성할 때 전체 크기를 지정해줘야 한다.
		생성된 여러 변수들은 index 관리한다. (index는 0번부터 시작.)
		  */
		
		// 선언 방법
		int[] score;  // java 스타일
//		int [] score;  // 띄어써도 괜찮다.
		int score2[]; // c 스타일
		
		// 변수 앞이 무조건 타입이라고 읽는 경우
		// score 변수는 "int로 구성된 배열이다."라는 뜻이다.
		
		// 배열은 참조 타입
		score = null; // 그래서 null을 넣을 수 있다.
		
		
		////////////////////////////
		
		
		int score_0 = 90;
		int score_1 = 60;
		int score_2 = 70;
		
		int[] intArray = new int[3];
		// heap 영역에 012 가 좌르륵 생겼다.
		intArray[0] = 90;
		intArray[1] = 60;
//		intArray[2] = 70;
		
		// 이런 게 가능.
		//intArray > 덩어리 intArray[0] > 한 조각
		
//		배열을 생성할 때 크기를 알려줘야 합니다.
//		[] 대괄호의 뜻이 다 다르다.
//		첫 번째 [ ] (int [ ]) : ‘int로 이루어진 **배열**이다’ 라는 뜻.
//		두 번째 [ ] (new int[3]) :  배열의 **크기**, 즉 한 번에 만들 변수의 **개수**. (0부터 1씩 증가)
//									타입의 크기만큼 연달아서 메모리를 할당한다. (eg. int 타입은 4비트)
//									첫 번째 주소를 변수(스택)에 저장
//									우리가 접근할 때는 index 0부터 첫 번째 변수를 활용할 수 있다.
//		세 번째 [ ] (intArray[0]) :  만들어진 변수 중에서 첫 번째 변수를 뜻함.
		
		System.out.println("intArray[0] : " + intArray[0]);
		System.out.println("intArray[2] : " + intArray[2]);
		// 기본 값은 0, false, null로 초기화된다.

		//	System.out.println("intArray[3] : " + intArray[3]);
		//	ArrayIndexOutOfBoundsException: 오류가 출력. 범위를 벗어났다.
		
		
		// 배열을 선언하는 두 번째 방법
		// 넣을 값을 모두 정확히 알고 있는 경우
		
		int[] intArray2 = new int[] {90, 60, 70};
		// 갯수도 알고, 값도 알고있는 경우
		
		int[] intArray2_1 = null;
		intArray2_1 = new int[] {90, (int)Math.random(), 70};
		// 이것도 된다
		intArray2_1 = new int[] {90, (int)Math.random(), 70, 80};
		// 이것도 된다. 이건 배열 수정이 아닌, 새로 만드는 것. 기존의 것 삭제.
		
		// 배열을 선언하는 세 번째 방법
		int[] intArray3 = {90, (int)Math.random(), 70};
		// 선언과 동시에 선언하는 경우라, new int []를 생략할 수 있지만
//		intArray3 = {90, (int)Math.random(), 70};
		// 이렇게 값을 재지정할 수 없다.
		
		System.out.println("intArray3의 길이 : " + intArray3.length);
		// intArray2+1.length = 5; 읽기 전용이라서 값 수정은 안 된다.
		
		System.out.println("intArray3 : " + intArray3);
		
		String[] sArr = new String[14];
		sArr[0] = "이름1";
		sArr[1] = "이름2";
		
		int k = 1;
		
		
		// sArr[] = 
		// for (; k <= 3; ++)
		// for (; k <= 4; ++)
		k++;
		sArr[k] = "이름" + (k+1);
		
		for(int i = 0; i < sArr.length; i++) {
			sArr[i] = "이름" + (i+1);
		}
		// 배열과 반복문은 찰떡궁합
		// <= 보다 <를 많이 쓴다.
		
		// sArr의 모든 내용을 출력
		
		for (int i = 0; i<sArr.length; i++) {
		System.out.println(sArr[i]);
		}
		
		// 깜짝퀴즈
		// 1~10까지 배열에 넣고 배열의 총 합 출력
		// 배열의 평균 출력
		
		int[] quiz = new int[10];
		for (int i = 0; i < quiz.length; i ++) {
			System.out.println(quiz[i] = (i+1));
		}
		int sum = 0;
		for (int i = 0; i < quiz.length; i++) {
			sum = sum + quiz[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum/quiz.length);
	
		/// 간단퀴즈
//		int[] simp = new int[10];
//		for (int i = 0; i < simp.length; i++) {
//			System.out.println("거꾸로 : " + simp[simp.length-1 - i]);
//		}

		// [3, 4, 7, 5, 1, 4, 6]
		// 7개 
		// 1. 홀수의 개수를 구하시오
		// sys plus % 2 == 0  / true / int true 몇 번
		// 2. 4보다 큰 수의 개수 구하기
		// sys plus > 4 / true / int true 몇 번
		// 3. 최대값 구하기
		/* 
		 * 문제4. 두번째 큰 수 구하기
		*/
		
		
		
		int[] plus = {3, 4, 7, 5, 1, 4, 6};
		int count = 0;
		
		for (int i = 0; i < plus.length; i ++) {
			if (plus[i] %2 == 1) {
				count ++;
			}
		}
		System.out.println("홀수는 몇 개 : " + count);
		count = 0;
		
		for (int i = 0; i < plus.length; i ++) {
			if (plus[i] > 4)
			{
				count ++;
			}
		}
		System.out.println("4보다 큰 수는 몇 개 : " + count);
		count = 0; 
		
		
		int max = 0;
		int sec = 0;
		
		for (int i = 0; i < plus.length -1; i++) {
			if (plus[i] > max) {
			max = plus[i];
			}
			
		// int max = Integer.MIN_VALUE;
		// int second = arr[0];
			
		}
		for (int i = 0; i < plus.length -1; i++) {
			if (plus[i] < max && plus[i] > sec) {
			sec = plus[i];
			}
		}
		System.out.println("짱 큰 애 : " + max);	
		System.out.println("2등인 애 : " + sec);	
			
		// 됐다 ㅠㅠ 
		/* 문제5. 배열을 하나씩 뒤(오른쪽)로 밀기
		 * 		5-1 : 0으로 채우기
		 * 3, 4, 7, 5, 1, 4, 6 > 0, 3, 4, 7, 5, 1, 4
		 * 
		 * 
		 * 
		 * 		5-2 : 첫자리에 마지막 것 넣기
		 * 3, 4, 7, 5, 1, 4, 6 > 6, 3, 4, 7, 5, 1, 4
		 * 
		 *
		 */
		
		// 5.1
		for (int i = (plus.length-1); i > 0; i --) {
			plus[i] = plus[i-1];
		}
			plus[0] = 0;
	
		for (int i = 0; i < plus.length; i ++)
		{
			System.out.println("0으로 채우기 : " + plus[i]);
		};
		
		
		
		// 5-2.
		int[] plus2 = {3, 4, 7, 5, 1, 4, 6};
		
		int i2 = plus2[plus2.length-1]; // 6을 피신 시켜
		for (int i = (plus2.length-1); i > 0; i --) {
			plus2[i] = plus2[i-1];
		}	// 쭉쭉 옮겨
		plus2[0] = i2; // 피신간 6을 데려와
		for (int i = 0; i < plus2.length; i ++) 
		{
			System.out.println("끝에 6넣기 : " + plus2[i]);
		};
		
		
		 /* 문제6. 임시비밀번호 8자리 만들기
		 * 		6-1 : 숫자로
		 * 		6-2 : 소문자로
		 * 		*6-3 : 숫자2개이상, 대/소문자 조합
		 */
	
		// 6.1
		System.out.print("비밀번호는 : ");
		int[] pwd = new int [8];
		
		for (int i = 0; i < pwd.length; i ++)
		{
			pwd[i] = (int)((Math.random()*9)+1);
			System.out.print(pwd[i]);
		}
		
		System.out.println(  );
		// 6.2
		
		System.out.print("비밀번호는 : ");
		int[] pwd2 = new int [8];
		
		for (int i = 0; i < pwd.length; i ++)
		{
			pwd2[i] = (int)((Math.random()*26) +97);
			System.out.print((char)pwd2[i]);
		}
		// 아스키코드 97 ~ 122 : 26개
		//	97 <= 어쩌고 <= 122의 범위
			
		System.out.println(  );
		// 6.3
		
		System.out.print("비밀번호는 : ");
		int[] pwd3 = new int [8];
		
		for (int i = 0; i < pwd.length; i ++)
		{
			pwd2[i] = (int)((Math.random()*26) +97);
			System.out.print((char)pwd2[i]);
		}
		// 아스키코드 
		// 48~57
		
		//6.3 
		/* 전략1
		 * 숫자 2개 먼저 뽑고 정해진 개수의 
		 * 전략 2 
		 * 숫자 대, 소문자를 random으로 정하기
		 * 숫자를 몇 개 뽑았는지 세어 두었다가
		 * 마지막에서 두 번쨰에서 숫자의 필수자리수 부족하면 더 뽑기*/
		
		// 숫자
		
		/* 
		 * 
		 * 
		 * 문제7. 예약
		 * 		자리가 10개 있는 소극장 예약 시스템
		 * 		자리 번호는 1~10번까지 번호의 자리가 있음
		 * 		만약1 : 예약이 가능하면 "n번자리 예약 했습니다"
		 * 		만약2 : 예약이 불가능하다면 "이미 예약 되어있습니다"
		 * 		메뉴 : "1.예약, 2.모든좌석현황, 3.잔여좌석, 4. 종료"
		 */
		
//		int[] arr3 = new int [10];
//		Scanner scan = new Scanner(System.in);
//		System.out.println("1. 예약, 2. 모든 좌석 현황, 3. 잔여좌석, 4. 종료");
//		int menu = scan.nextInt();
//		if (menu == 1) {
//			System.out.println("1~10까지 중에 예약 자리를 입력하숑");
//			int srv = scan.nextInt();
//			// 1~10까지 넣었는지 방어코드!
//			
//			if(arr3[rsv-1] == 1) {
//				System.out.println("예약 불가");}
//			else {
//				arr3[rsv-1] = 1;
//				System.out.println("자리번호 " + rsv + " 예약 성공");
//			}
//		} else if (menu == 2) {
//			for (int i = 0; i > arr3.length; i ++) {
//				if(arr3[i] == 0) {
//					System.out.println((i+1) + "번 예약 가능");
//				} else {
//					System.out.println((i+1) + "번 예약 불가");
//				}
		
		

		
		
		
		
		
		 /* 문제8. 로또 6개 배열에 저장
		 * 		단, 중복 없이
		 */
		
//		lotto[0] = (int)(Math.random()*45) + 1;
//		do {			
//			lotto[1] = (int)(Math.random()*45) + 1;
//		} while (lotto[0] != lotto[1]);
//		
//		do {			
//			lotto[2] = (int)(Math.random()*45) + 1;
//		} while (lotto[0] != lotto[1] && lotto[1] != lotto[2]);
		
		// 2번 index 진행중
//		boolean flag = false;
//			int index = 2;
//		for (int i = 0; i < index; i++) {
//			if(lotto[i] == lotto[index]) {
//				flag = true;
//				break;
//			}
//		}
//		
//		if(true) {
//			// 다시 뽑기
//		}
		int[] lotto = new int [6];
		boolean flag = false;
		for (int j = 0 ; j< lotto.length; j++) {
		do {lotto[j] = (int)(Math.random()*45) + 1;
			flag = false;
			for (int i = 0; i<j; i++) {
				if(lotto[i] == lotto[j]) {
					flag = true;
					System.out.println("중복발생");
					break;
				}
			}
		} while (flag);
		
		System.out.println("----------로또번호-------");
		for (int i = 0; i < lotto.length; i++) {
			if (i != 0) {
				System.out.print("," + lotto[i]);
			} else {
				System.out.print("," + lotto[i]);
			}
		}
		
		}	
		System.out.println();
//	
//		int[] class1 = new int [20];
//		int[] class2 = new int [20];
//		int[] class3 = new int [20];
//		int[] class4 = new int [20];
//		
		int[][] 천안 = new int [4][20];
		
		System.out.println("천안 : " + 천안);
		System.out.println("천안[0] : " + 천안[0]); // 메모리 주소 기반
		System.out.println("천안[0][0] : " + 천안[0][0]);
		
		int[][] test = {
					{1,2,3},
					{1,2,3,4},
					{78}
		};
		
		System.out.println("두 번째 배열의 마지막 : " + test[1][3]);
		System.out.println("길이 : " + test.length); // 열의 개수
		System.out.println("길이 : " + test[0].length); // 행의 개수
		System.out.println("길이 : " + test[1].length); // 행의 개수
		// [1][3]은 int값에 불과해, length를 사용할 수 없다.
		
		int [][] 수원 = new int [4][20];
		int [][] 서울 = new int [4][20];
		
		int [][][] 휴먼 = new int [2][4][20];
		휴먼[0] = 수원;
		휴먼[1] = 서울;  
		
		// 가상의 달력을 만든다.
		// 총 12개월, 모든 달은 30일, 모든 날짜 채워 넣기
		// 11월 출력하기
		
		// 배열 [][] 생성.
		// 포문으로 30일 > for 12 > 
		// 잠깐만... 0이 1이 되고, 30이 29가 되어야 한다.
	
		
	
//		// {1~30}{1~30}	
//		for (int i = 0; i < calendar[0].length; i++)
//			{calendar[0] = {i+1};
//			
//		for (int j = 0; j < calendar[0].length; j++) {		
//			calendar [i][j] = calendar [i][j+1];
//		}}
		

		int [] month1 = new int [30];
		month1[0] = 1;
		month1[1] = 2;
		
		for (int i = 0; i < month1.length; i++)
		{month1[i] = i+1;}
		for (int i = 0; i < month1.length; i++)
		System.out.print(month1[i] + "," );
		
		
		int[][] month = new int [12][30];
		for (int j = 0; j< month.length; j++) {
		for (int i = 0; i < month[0].length; i++)
		{month[j][i] = i+1;}}
		
		for (int i = 0; i <month[0].length; i++) {
			System.out.println("11월을 출력하자 : " + "11월 " + month[10][i] + "일");
		}
		
		for (int j = 5; j < 7; j++) {
		for (int i = 0; i <month[0].length; i++) {
			System.out.println("5~6월을 출력 : " + j + "월 " + month[j][i] + "일");
		}
		}
			
		// 배열을 깊은 복사
		String [] name1 = {"김", "이","박", "최"};
		// name과 정확한 동일한 name2를 만드세요.
		String [] name2 = new String [4];
		
		for (int i = 0; i > name1.length; i ++)
		{name2[i] = name1[i];
		}
		


}}