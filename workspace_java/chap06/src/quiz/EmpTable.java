package quiz;

import java.util.ArrayList;

public class EmpTable {

	Emp e1 = new Emp();
	
	ArrayList empList = new ArrayList();
	
	
	void add(Emp a) {
		System.out.println("직원정보 추가");
		empList.add(a);
	};
	
	void print() {
		System.out.println("목록 출력");
		for (int i=0; i<empList.size(); i++) {
			Emp e = (Emp)empList.get(i);
			System.out.println("사원 번호" + e.deptno);
			System.out.println("사원 이름" + e.name);
			System.out.println("급여 정보" + e.sal);
			System.out.println("상사 정보" + e.mgr);
			System.out.println();
		}
	}
	
	void select() {
		for (int i=0; i<empList.size(); i++) {
			Emp e = (Emp)empList.get(i);
			if(e.sal >= 3000) {
				System.out.println("급여가 3000 이상인 사원 출력");
				System.out.println("사원 번호" + e.deptno);
				System.out.println("사원 이름" + e.name);
				System.out.println("급여 정보" + e.sal);
				System.out.println("상사 정보" + e.mgr);
				System.out.println();
				}
			}
			
	}
	
	
	
	
	
//	void deptno(int a) {
//		e1.deptno = a;
//	}
//	
//	void name(String a) {
//		e1.name = a;
//	}
//	
//	void sal(int a) {
//		e1.sal = a;
//	}
//	
//	void mgr(int a) {
//		e1.mgr = a;
//	}
//	
//	void addEmp(int a, String b, int c, int d) {
//		System.out.println("직원 정보를 추가합니다.");
//		deptno(a);
//		name(b);
//		sal(c);
//		mgr(d);
//		
//	}
}
	

