package kr.or.human.dto;
import java.sql.Date;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// DTO : Data Tranfer Object
// VO : Value Object


//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor // 생성자 (
//@EqualsAndHashCode // 객체 비교를 위해서...

@Data // 위의 다섯 통합. 
public class EmpDTO {

	
	private int empno;		
	private String ename;	
	private String job; 
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
	private String type;
	private String keyword;
	private List empnos;
	
}
