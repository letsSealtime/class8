package kr.or.human.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human.dto.EmpDTO;

@Repository
public class EmpDAOImpl implements EmpDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<EmpDTO> selectEmpList() {
		List<EmpDTO> result = sqlSession.selectList("mapper.emp.selectEmp");
		
		// emp.xml에서 kr.or.human.dto.EmpDTO = DTO로 리턴.
		// DTO를 List에 차곡차곡 넣어둔다. 
		
		System.out.println("result : " + result);
		return result;
	}

}
