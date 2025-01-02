package sec02.exam01;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car();
		String m = myCar.model;
		System.out.println(m);
		
		Car myCar2 = new Car();
		myCar2.model = "TORRES2";
		System.out.println(myCar2.model);
		
		System.out.println(myCar.speed);
		
		System.out.println(myCar);
		// 주소가 나온다.
		
		
		
	}

}
