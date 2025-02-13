package sec01.exam01;

public class Child extends Parent {
 
	Child(){
//		super(); // 부모의 생성자, 생략 가능
		super(1);
		// super() 와 this()는 모두 첫줄에 적어야함. 같이 X
		// 상속을 받았을 때의 기본(부모) 생성자. (this = 나)
		System.out.println("Child 생성자 실행");
	}

	
	void printName() {
		
		
		System.out.println("name : " + name);
		System.out.println("this.name : " + this.name);
		String pName = getName();
		System.out.println("pName : " + pName) ;
	}
	
	// if name = name 이렇게 적었을 경우,
	// 전달인자가 필드를 가리는 현상 shadow가 나타난다.
	void setName(String name) {
		this.name = name;
		
	}
	
	String parentName() {
		String name = null; // 지역 변수
		String cName = this.name; // 내 필드
		String pName = super.name; // 부모 필드
		
		return super.name;
		
		
	}
	
}
