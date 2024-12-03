package sec01.exam01;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int score = 67;
//	Scanner scan = new Scanner(System.in);
		// 스캐너라는 객체 생성
		
		if(score >= 90) {
			System.out.println("점수가 100~ 90입니다.");
			System.out.println("등급은 A입니다.");
		}
		else if (score >= 80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		}	
		else if (score >= 70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		}	
		else {
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 D입니다.");
		}	
		
	// 문제 1	
	// z1 이 x1과 y1 사이에 있는지 확인
	int x1 = 15;
	int y1 = 20;
	int z1 = 17;
	
	if (z1 >= x1) {
		System.out.println("z1은 x1보다 크며,");
	if (z1 <= y1) {
		System.out.println("z1은 y1보다 작다.");
	}
	}
	
	boolean r1 = (z1 >= x1);
	boolean r2 = (z1 <= y1);
	if (r1 && r2) {
		System.out.println(z1 + "은 사이에 있다.");
	} else {
		System.out.println(z1 + "은 사이에 없다.");
	}
	
//	if (z1 >= x1) && (z1 <= y1)
	// 여기에 ! not을 붙이면, 분배법칙으로 반대가 된다.
//	if (z1 < x1) || (z1 > y1) 
		
	
	int x2 = 3;
	if ((x2 % 2) == 0) {
		System.out.println(x2 + " : 짝수");
	} else {
		System.out.println(x2 + " : 홀수");	
	}
	
	// 문제 2
	// 어제 온도가 -3도 였을 때
	// 1. 오늘 온도가 영하인지 영상인지
	// 2. 만약 영하라면 "영하 1도 입니다."
	// 영상이라면 "영상 2도 입니다"
	// 3. "어제보다 온도가 높습니다."
	// "어제보다 온도가 낮습니다."
	// 4. "어제보다 2도 높습니다."
	// ex. 3, -1면 "어제보다 4도 낮습니다."
	int yt = -3; // 어제 온도
	int t = -1;  // 오늘 온도
	
	// if가 0보다 크면 영상, n도 else 작으면 영하
	// if 새로 만듦, t > yt 어제보다 높음 / 작으면 t < yt
	// print "어제보다" if t print / if yt
	// 그 값을 더해서 if yt > t "낮습니다" / if yt < t "높습니다 
	
	if (t >= 0) {
		System.out.println("영상 " + t + "도 입니다.");
	} else {
		System.out.println("영하 " + -t + "도 입니다.");
	};
	
	if (t > yt) {
		System.out.println("어제보다 온도가 높습니다.");
	} else {
		System.out.println("어제보다 온도가 높습니다.");
	};
	
	int t1;
	if (t >= 0) {
		t1 = t;
	} else {
		t1 = -t;
	}

	int t2;
	if (yt >= 0) {
		t2 = yt;
	} else {
		t2 = -yt;
	}
	// 절대값 구함
	
	System.out.print("어제보다 " + (t1 + t2) + "도");
	
	if (t > yt) {
	System.out.println(" 높습니다.");	
	} else {
	System.out.println(" 낮습니다.");
	}
	
	// int diff = yt - t;
	// if (diff < 0) {
	// sys.out.printf("어제보다 %d도 높습니다.", diff); }
	
	
	// 문제 3
	// 어떤 수가 있을 때, 
	// "입력한 수는 100보다 큰 / 같은 / 작은 수이며
	// 양수이고 홀수입니다."
	
	System.out.println("입력한 수는");
	Scanner scan = new Scanner(System.in);
	int n3 = scan.nextInt();
	
	if (n3 > 100) {
		System.out.print("100보다 큰 ");
	} else if (n3 == 100) {
		System.out.print("100과 같은 ");
	} else {
		System.out.print("100보다 작은 ");		
	}
	System.out.print("수이며, ");
	if ((n3 % 2)==1) {
		System.out.println("홀수입니다.");
	} else {
		System.out.println("짝수입니다.");		
	}
	
	
	// 문제 4
	/* a,b 두 수가 있을 때 둘 중에 큰 값 출력 */
	
	int a = 34;
	int b = 23;
	
	if ((a-b)>0) {
		System.out.println(a);
	} else
		System.out.println(b);
	
	
	// 문제 5
	/*
	숫자가
	1일때 "일"
	2일때 "이"
	3일때 "삼"
	다른 수일때 "그 외"
	*/

	int d3 = 3;
	if (d3 == 1) {
		System.out.println("일");
	} else if (d3 == 2) {
		System.out.println("이"); 
	}
	else if (d3 == 3) {
		System.out.println("삼");
	} else {
		System.out.println("그 외");
	}
			
			
	// 문제 6
	/* 월에 따라서
	4계절을 출력
	봄 : 3,4,5
	여름 : 6,7,8
	가을 : 9, 10, 11
	겨울 : 12, 1, 2 
	 */
	
	int month = 2;

//	if (month < 1 ) {
//		month = 1;}
//	}
//	if (month > 12) {
//		month = 12;	
//	}
	
	if (month >= 1 && month <= 12) {
	if (month >= 3 && month <= 5) {
		System.out.println("봄");
	}
	else if (month >= 6 && month <= 8) {
		System.out.println("여름");
	}
	if (month >= 9 && month <= 11) {
		System.out.println("가을");
	}
	if (month == 12 || month == 1 || month == 2) {
		System.out.println("겨울");
	}}
	else {
		System.out.println("정확한 월을 입력해 주세요.");
	}
	
	// 어려운 문제 1. 
    // 두자리 정수가
    // 10의 자리와 1의자리가 같은지 판단

	int h1 = 33;
	int h2 = h1/10;
	int h3 = h1%10;
	if (h2 == h3) {
		System.out.println("10의 자리와 1의 자리가 같다.");
	} else {
		System.out.println("10의 자리와 1의 자리가 같지않다.");
	}
	
    // 어려운 문제 2.
    // 사각형의 한쪽 모서리 : xa: 10, ya: 20
    // 다른쪽 모서리 : xb: 90, yb: 100
    // 새로운 점 : xc, yc가 사각형에 포함 되는가?
	
	int xc = 39;
	int yc = 76;
	
	if (xc >= 10 && xc <= 90)	{
		System.out.println("점 xc는 사각형에 포함된다.");
	}
	else {
		System.out.println("점 xc는 사각형에 포함되지 않는다.");
	}
	if (yc >= 20 && yc <= 100) {
		System.out.println("점 yc는 사각형에 포함된다.");
	}
	else {
		System.out.println("점 yc는 사각형에 포함되지 않는다.");
	}
	
	
	
	
	}
	}
