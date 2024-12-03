package sec01.exam04;

public class Pyramidexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("--1단계--");
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("+");
		} System.out.println( );
	
		// 장기적인 숙제
		// 주사위 2개로 나올 수 있는 모든 조합을 출력
		// 2 : [1,1] 이렇게 출력하기
		
		// 2~12 for
		// d1, d2 
		// if 주사위1 눈 1일 떄, 주사위 2 다 출력
		// if 주사위1 눈 2일 때, 주사위 2 를 출력하되, (x1 != y2)
		// if 주사위1 눈 3일 때, 주사위 2 를 출력하지만~ [3,1 / 3,2]
		// 4, [4,1 / 4,2 / 4,3
		// if d2 !< d1

		for (int d1 = 1; d1 <= 6; d1 ++) {
				for (int d2 = 1; d2 <= 6; d2++)
				{if (d2 >= d1)
					System.out.println
					("[" + d1 + "]"+ "," + "[" + d2 + "]");
			}}
		
		
			
		
		// 중복 없이 출력하기
		// 2: 1가지 3 : 1가지 4: 2가지
	
			
			
	}

}
