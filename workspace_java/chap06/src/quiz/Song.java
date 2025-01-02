package quiz;

public class Song {
	
	String title;	// 제목
	String singer;	// 가수명
	int like;		// 좋아요 수
	
	// 필드
	// 변수 선언 : 변수타입 변수명
	// 변수 선언과 동시에 초기화는 가능
	// 나머지 "행동"은 불가능
	
	// 타이틀을 변경하는 메소드를 만들기
	void setTitle(String newTitle){
		title = newTitle;
//		return; (생략 가능)
	}
	
	Song(){
		System.out.println("Song 생성자 실행");
		String a = "무제";
		setTitle("무제");
	}
	
	// double 두개를 더하기 한 결과를 돌려주는 메소드를 만드시오
	double plus(double x, double y) {
		double sum = x + y;
		System.out.println("합계 + " + sum);
		return sum;
	}

	
	}	

