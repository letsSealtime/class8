package kr.or.human.service;

import java.util.List;

import kr.or.human.dto.EmpDTO;

public interface EmpService {

	List getEmpList();
	public EmpDTO getEmpOne();
	public EmpDTO getEmpno(int empno);
	public EmpDTO getEmpno2(EmpDTO empDTO);
	
	public int modifyEmp(EmpDTO empDTO);
	public int insertEmp(EmpDTO empDTO);
	public int deleteEmp(EmpDTO empDTO);
	

}
