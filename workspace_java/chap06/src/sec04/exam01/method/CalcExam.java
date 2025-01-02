package sec04.exam01.method;

public class CalcExam {
	// 여기선 전달인자 선언의 괄호
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Calc calc = new Calc();
		
		
		calc.powerOn(); // 여기서 괄호는 실행의 괄호
		// 묶음을 실행시켜라!
		System.out.println("calc.isOn : " + calc.isOn);
		calc.powerOff();
		System.out.println("calc.isOn : " + calc.isOn);
		
		int b = 7; 
		int a = calc.plus(b,10); // 얘가 17이라는 뜻인데, 저장이 안됐어~
		// int a에다 값을 저장해줘~
		
		double c = calc.divide(10,4);
		System.out.println("나누기 고고씽 : " + c);
		
		Calc[] d = new Calc[10]; // Calc를 배열로 만들었다.
		d[0] = new Calc(); // Calc의 첫 번째 값은 Calc 밖에 못들어간다
		
		int[] f = {1,2,3,4,5};
		calc.sum1(f); // 얜 15라는 값
		int f1 = calc.sum1(f);
		System.out.println("f 배열을 출력해 보자 : " + f1 );
		
		int f2 = calc.sum2(1,2,3,4,5);
		System.out.println("f2 : " + f2);
	}

}
