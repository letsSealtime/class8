package sec01.exam02;

public class TypeCastingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	int a = 2 + (3 * 4); // 여기서 ()는 우선순위
	//	long b = (long)a;  // 여기서 ()는 형변환 연산자
		                                                                                                                                                                                                                                                                                                                                                                                                                                             
	//	long c = a;
		// int가 long 보다 작으니까 형변환해도 손해가 없다.
		// 따라서 형변환 연산자 생략 가능.
		
		long d = 300000000000L;
		// 기본적으로 int가 되어서 L 적어야 한다.
		int e = (int)d;
		System.out.println("e : " + e);
		// long > int 변환하는 경우 
		// 8byte 중에서 상위 4byte만 남기기 때문에 (왼쪽 4byte = 왼쪽 16개)
		// 예측 불가능한 숫자가 나올 수 있다.
		
		long f = 10;
		System.out.println(f);
		/*
		 * int ii = 10;
		 * long f = (long)ii; (자동변환하긔)
		 * long f = ii; 
		 *  */
		
		int g = 3;
		long h = 4L;
		// (long)g + h;
		
		double j = 3.3;
		double k = (double)g + j;
		double k2 = g + j;
		
		System.out.println("(double)g : " + (double)g);
		
		int k3 = (int)j;
		System.out.println(k3);
		//소수점을 int로 강제 변환하면 정수가 나온다.
		
		System.out.println((long)j);
		
		double total = 4.3;
		int count = 4;
		System.out.println((int)(total/count));

// 		항상 풀어서 적어보자. 원본을 남기자.
		// total / (double) count
		// 얘를 int 형변환
// 우선 순위가 먼저고 형상 변환자는 그 다음.
		
		
	    // total(단위 만 원)은 회식비입니다.
        // count는 참석 인원
        // 참석 인원은 만 원단위로만 회식비를 낸다.
        // 이때 인당 얼마를 내야 하는지 출력하시오.

        // 깜작 퀴즈
        // 그럼 주최자는 얼마를 내야 하는가?
		
		// total / (double) count;
		
		double result1 = (int)total / count;
		// 1임
		System.out.println(count - result1);
		double result2 = (count - result1);
		System.out.println(result2 - result1);
		
		// 찐문제
		/* int a = 30;
		 * int b= 407;
		 * 
		 * a = 407 이런 거 금지wwww
		 * 
		 * System.out.println(a); // 407
		 * System.out.println(b); // 30
		 * 
		 * 
		 * 
		  */
		
		String a = "수박";
		String b = "볼링공";
		
		String a2 = a;
		a = b;
		b = a2;
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
