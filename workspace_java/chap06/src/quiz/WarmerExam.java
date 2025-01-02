package quiz;

public class WarmerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Warmer warmer1 = new Warmer();
		warmer1.powerOn();
		warmer1.level("고온");
		
		System.out.println("-------------");
		
		Warmer warmer2 = new Warmer();
		warmer2.powerOff();
		warmer2.level("저온");
	}

}
