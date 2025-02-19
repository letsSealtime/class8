package quiz;

public class Barista extends Benefit {

	
	void coffee() {
		System.out.println("커피를 만듦");
	}
	
	void washDish() {
		System.out.println("설거지를 합니다.");
	}
	
	@Override
	void study() {
		System.out.println("커피 공부를 합니다.");
	}

	void work() {
		System.out.println("보람찬 하루 일과 시작~");
		super.welcome();
		coffee();
		washDish();
	}
	
}
