package quiz;

public class EmpExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e1 = new Emp();
		e1.name = "SMITH";
		e1.deptno = 7369;
		e1.sal = 800;
		e1.mgr = 7902;
		
		Emp e2 = new Emp();
		e2.deptno = 7902;
		e2.name = "FORD";
		e2.sal = 3000;
		e2.mgr = 7566;
		
		EmpTable table = new EmpTable();
		table.add(e1);
		table.add(e2);
		
		table.print();
		
		table.select();
				
		
		
	}

}
