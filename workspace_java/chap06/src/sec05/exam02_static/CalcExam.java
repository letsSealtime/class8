package sec05.exam02_static;

public class CalcExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc c = new Calc();
		c.color = "버건디";
		
		System.out.println(Calc.pi);
		
		
		Calc c2 = new Calc();
		c.color = "파랑";
		System.out.println(c2.pi);
		
		Calc.pi = 2;
		System.out.println(c2.pi);
		
		
		Calc.printPi();
		
		Calc.out.println("글씨");
		
		c.printPi2();
	}

}
