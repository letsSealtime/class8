package sec01.exam01;

import java.util.ArrayList;

public class ArrayCopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1호점에서 판매하는 메뉴
		String[] menu1 = new String[3];
		menu1[0] = "따아";
		menu1[1] = "말차";
		menu1[2] = "라떼";
		
		// 2호점에서 1호점과 똑같은 메뉴를 판매할 예정.
		/* 
		 * 얕은 복사
		 * shallow copy, thin copy, call by reference
		 * stack 영역의 값(주소)만 복사
		 * 값을 변경할 경우 원본이 바뀝니다
		 * */
		
		String[] menu2 = menu1;
		menu2[2] = "바나나라떼";
		System.out.println("menu1[2] : " + menu1[2]);
		// 얕은 복사로 주소가 연결되어 있다.
		// 주소값만 공유하는 것.
		// 복사된 값을 바꾸면 원본값도 바뀜.

		
		/*
		 * 깊은 복사
		 * deep copy, deep clone, call by value
		 * 전혀 다른 heap 영역에 똑같은 내용으로 채워넣은 것
		 * 원본과 복사본은 전혀 다른 객체 
		 * */
		
		String [] menu3 = new String [menu1.length];
		for (int i = 0; i < menu1.length; i++) {
			menu3[i] = menu1[1];
		}
		menu3[2] = "연유라떼";
		System.out.println("menu1[2] : " + menu1[2]);
		System.out.println("menu3[2] : " + menu3[2]);
		
		// 3호점에서만 "사라다빵"을 팔고싶다.
		/* menu3 보다 크기가 1개 많은 새로운 배열을 만들고
		 * 앞부분은 깊은 복사해놓고, 마지막에 "사라다빵"을 수동으로 추가*/

		menu3 = new String [menu1.length +1];
		
		for (int i = 0; i < menu1.length; i ++) {
			menu3[i] = menu1[i]; 
		}
		menu3[menu3.length -1] = "사라다빵";
		
		for (int i = 0; i < menu3.length; i ++) {
			System.out.println("3호점 메뉴 : " + menu3[i]);
		}
			
		// ArrayList 사용법
		ArrayList list = new ArrayList();

		// (값을) 추가
		list.add(1);
		list.add("문자");
		list.add(false);

		// 사용(값을 꺼낼 때)
		System.out.println( list.get(0));
		System.out.println( list.get(1));
		System.out.println( list.get(2));
		
		// 사이즈(크기)
		System.out.println(list.size());
		System.out.println(list);
		
	
//		for (int i = 0; i < menu3.length; i ++) {
//			String menu = menu3[i];
//			System.out.println("menu : " + menu);
//		} 고전적 for문 (지금까지 쓴 거)
		
		// 향상된 for문 Enhanced for
		for ( String menu : menu3 ) {
		System.out.println("menu : " + menu);}
		// menu3의 값을 String menu에 싹 다 넣음
		
		
		// 문제 5번
		// 합
		// 평균 : 합 / 개수
		int [][] array = { {95, 86},
				{83, 92, 96},
				{78,83, 93, 87, 88}	
		};
		int count = 0;
		int sum = 0;
		int max = -1;
		for (int i = 0; i < array.length; i ++) {
			for (int j = 0; j < array[i].length; j++) {
				sum = sum + array [i][j];
				count ++;
			}}
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (double)(sum/count));
		// 나누기할 땐 double을 잊지 말자
		// 최대값
		
		for (int i= 0; i < array.length; i++) {
			for(int j= 0; j < array[i].length; j++) {
				if (max < array[i][j]) {
					max = array[i][j];
				}
			}
		}
		System.out.println("최대값 : " + max);
		
	}

}
