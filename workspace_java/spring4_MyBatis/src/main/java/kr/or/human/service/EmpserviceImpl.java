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
	
	@Override
	public EmpDTO getEmpOne() {
		EmpDTO dto = empDAO.selectOneEmp();
		return dto;
	}

	@Override
	public EmpDTO getEmpno(int empno) {
		EmpDTO dto = empDAO.selectOneEmpno(empno);
		return dto;
	}
	
	@Override
	public EmpDTO getEmpno2(EmpDTO empDTO) {
		EmpDTO dto = empDAO.selectOneEmpno2(empDTO);
		return dto;
	}
	
	@Override
	public int modifyEmp(EmpDTO empDTO) {
		int countUpdate = empDAO.updateEmp(empDTO);
		return countUpdate;
	}

	@Override
	public int insertEmp(EmpDTO empDTO) {
		int countUpdate = empDAO.insertEmp(empDTO);
		return countUpdate;
	}

	@Override
	public int deleteEmp(EmpDTO empDTO) {
		int countUpdate = empDAO.deleteEmp(empDTO);
		return countUpdate;
	}
	
	@Override
	public int joinEmp(EmpDTO empDTO) {
		int countUpdate = empDAO.insertEmp(empDTO);
		return countUpdate;
	}
	
	@Override
	public int retireEmp(EmpDTO empDTO) {
		int countUpdate = empDAO.deleteEmp(empDTO);
		return countUpdate;
	}

	@Override
	public List<EmpDTO> getEmpSearchList(EmpDTO empDTO) {
		
		if("ename".equals(empDTO.getType())) {
			
			empDTO.setEname( empDTO.getKeyword() );

		} else if(empDTO.getType() != null && empDTO.getType().equals("sal")) {
			try {
				int sal = Integer.parseInt( empDTO.getKeyword() );
				empDTO.setSal( sal );
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		List list = empDAO.selectEmpSearchList(empDTO);
		return list;
	}
}
