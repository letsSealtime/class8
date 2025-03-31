package kr.or.human.service;

import java.util.List;

import kr.or.human.dto.EmpDTO;

public interface EmpService {

	List getEmpList();
	public EmpDTO getEmpOne();
	public EmpDTO getEmpno();
	public EmpDTO getEmpno2(EmpDTO empDTO);

}
