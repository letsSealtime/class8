package sec01.exam01;

public class RefExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 10;
		int b = a;
		System.out.println("a + b : " + a + "," + b);
		b = 12;
		System.out.println("a + b : " + a + "," + b);
		
		// a와 b는 별개로 관리된다.
		
		String c = "김도희";
		// = 을 기준으로 오른쪽이 먼저 실행된다.
		// "최민수"를 힙heap 영역의 비어있는 번지에 할당
		// 스택stack 영역의 변수 c에 그 번지가 기록된다.
		
		System.out.println(a == b);
		// ==는 무조건 stack의 값을 비교한다.
		
		String d = new String ("김도희");
		// String c = "김도희"; 이걸 줄여쓴 것.
		// 무조건 힙영역의 새로운 번지에 할당하는 방법.
		System.out.println(d);
		
		System.out.println(c == d);
		System.out.println(c.equals(d));
		// 주소가 다르기 때문에, 값을 직접 비교하는 equal을 사용해야 한다.
		// equals() : string은 char의 연합.
		// 한 글자씩 쪼개서 비교하는 반복문이다.
		// 반대로 string 주소값만 비교하고 싶으면 == 를 사용하면 된다.
		
		String e = "김도희";
		System.out.println(c == e);
		// 같은 값을 계속 쓰면 string은 같은 주소를 할당.
		
		// a = null;
		// 기본 타입은 null을 넣을 수 없다.
		
		String f = "휴먼";
		System.out.println("f == null : " + (f == null));
		// null 상태는 언제든지 비교할 수 있다.
		
		f = null; // f = ""와 다르다.
		System.out.println("f == null : " + (f == null));
		// null은 참조하는 주소가 없는 상태
		// 위에서 아래로 실행하며, f를 다시 복구할 수 없다.
		
		System.out.println("f + \"abc\" : " + (f + "abc"));
		
		// 초기화나 값이 할당되지 않은 경우 사용은 못한다.
		// String g;
		// g를 초기화 하지 않아서 오류.
		
		String g = null;
		System.out.println("g == null : " + (g == null));
	
//		System.out.println("g.equals : " + g.equals(c));
		// 오류. null이라서 문자열을 비교할 수 없다.
		
		if (g != null) { // 방어코딩. 
			System.out.println("g.equals : " + g.equals(c));
		}
	}

}
