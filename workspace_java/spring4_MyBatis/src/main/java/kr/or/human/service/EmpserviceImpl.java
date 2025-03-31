package kr.or.human.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import kr.or.human.dao.EmpDAO;
import kr.or.human.dto.EmpDTO;

@Service
public class EmpserviceImpl implements EmpService {

	@Autowired
	EmpDAO empDAO;
	
	public List getEmpList() {
		List list = empDAO.selectEmpList();

		return list;

	}
	
	public EmpDTO getEmpOne() {
		EmpDTO dto = empDAO.selectOneEmp();

		return dto;

	}
	
	public EmpDTO getEmpno() {
		EmpDTO dto = empDAO.selectEmpno(7788);

		return dto;

	}
	
	
	public EmpDTO getEmpno2(EmpDTO empDTO) {
		EmpDTO dto = empDAO.selectEmpno2(empDTO);

		return dto;

	}
	
}
