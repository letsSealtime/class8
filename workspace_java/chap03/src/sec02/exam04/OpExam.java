package sec02.exam04;

public class OpExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean a = false;
		System.out.println(a);

		a = !a;
		// !a는 not a. 즉 true. a에 ture를 덮어씌운다.
		System.out.println(a);
		
		double b = 7.0;
//		System.out.println(b/0);		double을 0으로 나누면 infinity
//		System.out.println(3/0);		int를 0으로 나누면 by zero 에러
		
		int c = 230309843;
		int d = 5;
		System.out.println("몫 : " + (c/d));
		
		int e = 10000;
		int l = 4500;
		System.out.println("커피는 몇 잔 : " + (e/l));
		int f = e/l;
		int change = e % l;
		System.out.println("잔돈은 얼마? : " + change);
		
//		조금 어려운 문제
//		올리브영에서 전품목 15% 세일 중!
//		1. 꿀홍차(5000)을 샀을 때 얼마를 내야 하나?
//		2. 꿀홍차(5000)와 립스틱(30000)을 샀어요. 얼마 내야 하나요?
		
		int tea = 5000;
		int lip = 30000;
		int cart = tea + lip;
		double sale = 0.85;
		
		System.out.println("내가 내야 하는 가격 : " + (int)(tea*sale));
		System.out.println("비싼 거 쓰네 쓰니야 : " + (int)(cart*sale));
		
		
//		7234원이 있어요
//		5000원, 1000, 500, 100, 50, 10, 1원으로 
//		각각 최대 몇개까지로 표현할 수 있나요?
		
		int money = 7234;
		System.out.println("5000원은 몇 장 : " + money / 5000);
		int money2 = money % 5000;
		System.out.println("1000원은 몇 장 : " + money2 / 1000);
		int money3 = money2 % 1000;
		System.out.println("500원은 몇 개 : " + money3 / 500);
		int money4 = money3 % 500;
		System.out.println("100원은 몇 개 : " + money4 / 100);
		int money5 = money4 % 100;
		System.out.println("50원은 몇 개 : " + money5 / 50);
		int money6 = money5 % 50;
		System.out.println("10원은 몇 개 : " + money6 / 10);
		int money7 = money6 % 10;
		System.out.println("1원은 몇 개 : " + money7 / 1);
		
	// money2 = money2 % 1000 이렇게 변수에 값을 덮어씌워도 무관하다.
	// 오히려 재활용하면 메모리가 덜 잡힐 수 있다.
		
		System.out.println("" + 3 + 3.0);
		
		String c2 = "100";
		int c3 = Integer.parseInt(c2);
		System.out.println(c3 + 3);
		
		//소수점 이하는 정확하지 않아서
		// 0.1을 0.999999 또는 0.1000001로 처리할 수 있다.
		// 같은 타입으로 변환해서 비교하자
		
		System.out.println("3 != 3 : " + (3 != 3));
		
		String s1 = "김도희";
		String s2 = "김도희";
		System.out.println(s1 == s2);
		// 글씨 비교는 == 사용 금지 그럼 어떻게 비교하느냐?
		
		System.out.println(s1.equals(s2)); // 이렇게~ "글씨"equals.(비교값)
		
		int i1 = 87;
		System.out.println(i1 + "은 B학점인가?");
		System.out.println(
			(i1 >= 80) && (i1 < 90)
				);
		
		System.out.println(i1 + "은 B학점인가?");
		System.out.println(
			(i1 >= 80) || (i1 < 90)
				);
		System.out.println( 10 | 3);
		
		int k1 = 7;
		int k2 = 15;
		int k3 = 17;
		boolean a1 = k2 > k1;
		boolean a2 = k3 > k2;
		System.out.println("k3이 가장 큰 값인가? : " + (a1 && a2));
		System.out.println(
				(k3 >= k1) && (k3 >= k2)
				);
		
		int m1 = 5;
		m1 = m1 + 2;
		m1 += 2;
		
		money2 = money2 % 500;
		money2 %= 500;
		// 내가 나에게 다시 값이 들어갈 때 대입 연산자를 사용한다.
		
		int n1 = 10;
		n1 += 1;  
		n1 ++ ; // 원래 값을 1 증가 시킨다. 
		++ n1;
		
		n1 = n1 - 1;
		n1 -= 1;
		n1 --;  // 원래 값을 1 감소 시킨다.
		-- n1;
		
		int n2 = 10;
		System.out.println("n2 : " + (n2++));
		// n2가 먼저 있으면 n2 (10)을 쓰고 쁠쁠하고 저장
		System.out.println("n2 : " + (++n2));
		// 쁠쁠한 다음에 n2 = 11 : 덮어씌움
		System.out.println("n2 : " + (n2));
		// 그래서 n2 = 11
		
		int z = 1;
		
		System.out.println( z++ + ++z);
		System.out.println(z);
		
		
		int score = 95;
		char grade = (score > 90) ? 'A' : 'B';
		
		int var1 = 5;
		int var2 = 2;
		double var3 = ((double)var1 / var2);
		// 얘가 범인임 int 5 / 2로 계산이 됐던 것
		System.out.println(var3);
		int var4 = (int)(var3 * var2);
		System.out.println(var4);
		
		int value = 356;
//		value /= 100; 
//		value *= 100;
//		System.out.println(value);
		System.out.println(value/(int)100*100);
		
		double v1 = 1000;
		double v2 = 457;
		int v3 = (int)(v1*1000 / v2);
		System.out.println((double)v3/1000);
		
	}

}
