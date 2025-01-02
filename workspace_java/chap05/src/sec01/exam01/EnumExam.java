package sec01.exam01;

public class EnumExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Week week; 
		// Enum으로 Week 이라는 선언을 만들었어~
		
		Week week_m = week.MONDAY;
		// week_m은 사용자가 입력한 값
		
		if (week_m == Week.MONDAY) {
			System.out.println("월요일");
		} else if (week_m == Week.TUESDAY) {
			System.out.println("화요일");
		}
		
		// p. 230 Calendar 예시로 이해
		
		
		
	}

}
