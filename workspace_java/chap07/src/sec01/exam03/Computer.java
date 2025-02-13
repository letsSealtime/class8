package sec01.exam03;

public class Computer extends Calc {
	
	
	@Override // 부모에 해당 메소드가 있는지, 검사해줌
	// 없으면 빨간줄 쳐서 실행 막는다.
	int plus(int x, int y) {
		System.out.println("문의하신 정답은");
		System.out.println(x + y + "입니다");
		return x + y;
	}
	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer의 areaCircle 실행");
		return Math.PI*r*r;
	}
	
}
