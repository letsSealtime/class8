package sec01.exam01;

public class VarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 한줄 주석
		/* 범위 주석
		 * 여러 줄 가능
		 *  */
		
		// 이클립스 단축키
		/* 
		 * 한줄 지우기 : Ctrl + d
		 * 한줄 복사 : Ctrl + Alt + 위아래 방향키
		 * 한줄 이동 : Alt + 위아래 방향키
		 * 코드 정렬 : Ctrl + Shift + f
		 * 주석 단축키 : Ctrl + /
		 * 
		 * */
		
		System.out.println("Hello World 안녕");
	
		// 변수 선언
		
		// 에러는 왜 났을까? VariableIniExam
		
//		int value = 30; // 선언과 동시에 초기화
		// 혹은
		int value;
		value = 30;
		
		int result = value + 10;
	// = 를 기준으로 오른쪽 먼저 실행
	// value 에 있는 값을 꺼내서 + 10한 결과를 result 변수에 저장
		
		System.out.println(result);
		System.out.println(result);
		result = 100;
		System.out.println(result);
		
	}

}
