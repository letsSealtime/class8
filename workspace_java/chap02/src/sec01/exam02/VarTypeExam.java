package sec01.exam02;

public class VarTypeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 127;
//		b = 128;
		
		
		long l1 = 10;
		long l2 = 20L;
		
//		long l3 = 10000000000;
		long l4 = 10000000000L;
		
		char  c1 = 'A';
		System.out.println("c1 : " + c1);
		char c2 = 67; // 아스키코드 대문자 C가 들어간다.
		System.out.println("c2 : " + c2);

		System.out.println("c2 : " + (c2-c1));
		
		char c3 = 'a';
		System.out.println("c3-c1 : " + (c3-c1));
		
		
		
		System.out.println(c2 + (c3-c1));
		
		String s1 = "김도희";
		System.out.println("s1 : " + s1);
		
		String s2 = "\"";
		
		String s3 = "번호\t이름";
		String s4 = "번호2\t이름";
		System.out.println(s3);
		System.out.println(s4);
		
		String s5 = "홍길동\n김자바";
		System.out.println(s5);
		
		System.out.print(1);
		System.out.print(2);
		System.out.println(3);
		System.out.println(4);
		
		double d = 0.123456789342847928347928374823;
		System.out.println("d : " + d);
//		double은 소수점 16번째 자리까지 정확함
		
		float f = 0.123456789342847928347928374823f;
		System.out.println("f : " + f);
//		float은 소수점 7번째 자리까지 정확함

		boolean b1 = true;
		boolean b2 = false;
	}
	

}
