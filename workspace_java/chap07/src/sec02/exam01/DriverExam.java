package sec02.exam01;

public class DriverExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coupe coupe = new Coupe();
		
		Driver driver = new Driver();
		driver.run( (Car)coupe);
		
		Landrover land = new Landrover();
		driver.run(land);
		
		HumanCar humnacar = new HumanCar();
//		driver.run(humanCar);
		
	}

}
