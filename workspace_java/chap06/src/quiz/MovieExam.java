package quiz;

public class MovieExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie movie = new Movie("무파사", 2025);
		System.out.println(movie.title);
		
		movie.reset("위키드", 2024);
		System.out.println(movie.title + ", " + movie.year);
	
//		movie.setTitle("네오의 사랑");
		movie.setTitle(null);
		System.out.println(movie.title);
	
		movie.printAll();
	}

		
	}
