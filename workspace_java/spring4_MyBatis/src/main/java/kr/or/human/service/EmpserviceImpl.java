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
	
}
