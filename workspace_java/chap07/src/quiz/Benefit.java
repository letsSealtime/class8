package quiz;

public class Benefit extends Emp {

	void study() {
		System.out.println("공부를 합니다.");
	}
	
	void salary(int salary) {
		System.out.println("월급 "+ salary + "만원을 받습니다.");
	}
	
	void benefit(int salary) {
		this.salary(salary);
		study();
	}
	
}
