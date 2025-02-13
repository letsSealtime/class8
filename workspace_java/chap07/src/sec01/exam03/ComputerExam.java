package sec01.exam03;

public class ComputerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		int a = calc.plus(1,3);
		System.out.println("calc.plus 결과 : " + a);
		
		System.out.println("-------------");
		
		Computer computer = new Computer();
		int b = computer.plus(10, 30);
		System.out.println("computer.plus 결과 : " + b);

		
		double r = computer.areaCircle(2.0);
		System.out.println("calc.areaCircle 결과 : " + a);
	
	}

}
