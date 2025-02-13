package sec01.exam01;

public class Parent {

	
	String name = "Parent의 name";
	
	String getName(){
		System.out.println("Parent의 getName실행");
		return this.name;
	}
	
	Parent(){
		System.out.println("Parent 실행자 실행");
	}
	
	Parent(int a){
		System.out.println("Parent 생성자 실행");
	}
	
}
