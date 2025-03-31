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

	@Override
	public EmpDTO selectOneEmp() {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectOneEmp");
		
		// 결과를 딱 하나만 꺼내야할 때, selectOne
		// 바로 DTO로 반환한다. (myBatis 메소드)
		
		System.out.println("dto : " + dto);
		return dto;
	}
	
	@Override
	public EmpDTO selectEmpno(int a) {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectEmpno", a);
		
		System.out.println("dto : " + dto);
		return dto;
	}
	
	@Override
	public EmpDTO selectEmpno2(EmpDTO empDTO) {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectEmpno", empDTO);
		
		System.out.println("dto : " + dto);
		return dto;
	}
	
}
