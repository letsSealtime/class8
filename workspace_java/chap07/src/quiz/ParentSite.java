package quiz;

public class ParentSite {

	String name;
	String id;
	String pw;
	
	boolean join(String name, String id, String pw) {
		System.out.println("회원가입 중입니다.");
		this.name = name;
		this.id = id;
		this.pw = pw;
		return true;
	}
	
	String findId(String name) {
		System.out.println("ID를 찾는 중입니다.");
		return name;
	}
	
	
}
