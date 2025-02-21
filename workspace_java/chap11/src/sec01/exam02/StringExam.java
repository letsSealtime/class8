package sec01.exam02;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "영일이삼사오육칠팔구삼사";
		
//		char a = 'a'; char에는 홀따옴표
		char c = s1.charAt(0);
		System.out.println("char c : " + c);
		
		int i = s1.indexOf("삼사");
		// '삼사'가 온전히 일치하는 곳의 최자측 위치가 출력된다.
		System.out.println("indexOf i : " + i);
		
		int i2 = s1.indexOf("a");
		System.out.println("indexOf 없는 것 : " + i2);
		// 없는 것이라면 -1 이 출력된다.
		
		int i3 = s1.lastIndexOf("삼사");
		System.out.println("lastIndexOf : " + i3);
		// 뒤에서부터 훑고 찾아준다.
		
		String email = "todair@human.or.kr";
		
		if (email.indexOf(".") > 0 && email.indexOf("@") > 0) {
				System.out.println("정확한 이메일 주소 맞긔윤");
			} else System.out.println("정확한 이메일 주소가 아닙니다.");
		
		
//		for(int j = 0; j<s1.length(); j++) {
//			char c1 = s1.charAt(j);
//			if(c1 == '@') {
//				// 인덱스를 출력 또는 return 하는 메소드
//				break;
//			}
//		}
		
		// 첫번째 전달인자를 두번째 전달인자로 모두 바꿔줌
		String s2 = s1.replace("삼사", "34");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		// replace는 일치하는 모든 것을 바꿔준다.
		// 원본은 안 바꾸는 비파괴 함수
		
		// 시작 index 부터 종료 index 바로 앞까지 잘라 돌려준다.
		String s3 = s1.substring(2,4);
		System.out.println("substring(2, 4) : " + s3);
		
		// 성별 출력하기
		String ssn = "950321-2000000";
//		String s4 = ssn.substring(7,8);
//		if (s4 == "2") {
//			System.out.println("여성입니다.");
//		}
		
		
		// 전달인자 하나면 거기서부터 끝까지
		int start = ssn.indexOf("-") + 1;
		int end = start + 1;
		String s4 = ssn.substring(start,end);
		if(s4.equals("2")) {
			System.out.println("여자");
		}
		
		// 앞뒤 공백만 제거, 중간의 공백은 제거하지 않음
		String s5 = "     글씨   중간에    띄  우기     ";
		System.out.println("[" + s5 + "]");
		System.out.println("[" + s5.trim() + "]");
		
		
		// 구분자로 글씨를 잘라서 배열로 돌려준다. 
		// 구분자는 사라진다. 
		// split의 전달인자는 String이 아니라 정규표현식
		// 정규표현식에 예약글자는 그냥 쓰면 안 된다
		// 역슬래시 \를 이용해, 탈출하거나, []로 감싼다. 
		String menu = "아무거나,풀떼기,햄부기";
		String[] menus = menu.split(",");
		for(String m : menus) {
			System.out.println(m);
		}
		
		String url = "cafe.naver.com";
		// String[] urls = url.split(".");
		// 정규표현식에서 .은 예약 문자라서 안된다.
		// []로 감싸거나,
		String[] urls = url.split("[.]");
		// \\를 적거나
		String[] url2 = url.split("\\.");
		System.out.println(url2.length);
		
		// 검색어의 key 값은 query입니다.
		// 문제 1 검색어만 출력하시오.
		String search = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=grok3";
		
		
		
		// 문제 2 S
		// html 속성 class 에 cl text가 있을 때,
		// target의 class가 존재하는지 판단
		String cl = "red bigy px";
		String target = "big";
		
		
		// 아래 코드 처럼하면 메모리가 낭비된다.
		String a = "1";
		a += "b";
		
		// 메모리를 효율적으로 사용한다.
		StringBuffer sb = new StringBuffer("abc");
		sb.append("e");
		
		
	}

}
