package quiz;

public class Phone {
	
	String number;
	
	
	boolean power;
	
	void call(String number) {
		System.out.println(number + "로 전화 거는 중...");
		
	}

	void onOff() {
//		if(this.power) {
//			this.power = false;
//		} else {
//			this.power = true;
//		}
		
		this.power = !this.power;
	}
	
	void bell() {
		System.out.println("따르릉");
	}
	

	
	
}


