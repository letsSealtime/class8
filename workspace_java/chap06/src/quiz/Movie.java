package quiz;

public class Movie {
	
	String title;
	int year;
	
	Movie(String x, int y){		
		title = x;
		year = y;
	}
		
	void reset(String x, int y) {
		this.title = x;
		this.year = y;	
	}

	void setTitle(String x) {
		if (x != null) {
		this.title = x;
		}
		else {
		System.out.println("제목을 제대로 입력해 주세여");
	}
	}
	
	void printAll() {
		System.out.println(this.title);
		System.out.println(this.year);
	}
}