package quiz;

public class Clerk extends Benefit {

	@Override
	void study() {
		System.out.println("미래를 위한 공부를 합니다.");
	}
	
	void calc() {
		System.out.println("매출 정산을 합니다.");
	}
	
	void mng() {
		System.out.println("매장 관리를 합니다.");
	}
}
