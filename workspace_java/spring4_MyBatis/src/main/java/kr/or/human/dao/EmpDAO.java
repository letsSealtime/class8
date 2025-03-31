package kr.or.human.dao;

import java.util.List;

import kr.or.human.dto.EmpDTO;

public interface EmpDAO {

	List<EmpDTO> selectEmpList();
	public EmpDTO selectOneEmp();
	public EmpDTO selectEmpno(int a);
	public EmpDTO selectEmpno2(EmpDTO empDTO);
}
