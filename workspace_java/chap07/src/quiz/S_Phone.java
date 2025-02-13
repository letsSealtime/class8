package quiz;

public class S_Phone extends Phone {
	
	S_Phone(){
		super();
	}
	
	
	@Override
	void bell(){
		System.out.println("띠리리링띠리링~~~");
	}
	
	
	void camera() {
		System.out.println("찰칵");
	}
	
	void sendMsg(String msg) {
		System.out.println("문자 발송 중..." + msg);
		System.out.println("문자 발송 완료");
	}
	
	
}
