package sec04.exam03;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			// main 메소드
		// java가 실행된다는 건
		// JVM에서 수행한다는 이야기
		// java가 자동 실행해 주는 유일한 메소드
		// void main(String[])
		// 없으면 실행이 안 돼~
		for(int i = 0; i <args.length; i++) {
			System.out.println("args[+i+] : " + args[i]);}
			
		Car car = new Car();
		System.out.println(car.speed);
		car.setSpeed(200);
		System.out.println(car.speed);
		
		boolean  gasState = car.isLeftGas();
		if (gasState) {
			System.out.println("출발합니다");
			car.run();
		}
	}

}