package quiz;

public class 구구단 {

	void method(int x) {
		for (int i =0; i<10; i++) {
			System.out.println("3"+i+"은(는)"+x*i+"~");
		}
	}
	
	void method1(int x, int y) {
		for (int i=0; i <= y; i++) {
		}
	}
	
	void kakao () {
		System.out.println("카카오톡 실행");
	}

	void discord () {
		System.out.println("디스코드 실행");
	}
	
	void boot() {
		System.out.println("컴퓨터 부팅");
		discord();
		kakao();
	}

}
