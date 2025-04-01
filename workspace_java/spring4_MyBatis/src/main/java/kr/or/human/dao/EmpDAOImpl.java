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
	public EmpDTO selectOneEmpno(int empno) {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectEmpno", empno);
		System.out.println("dto: "+ dto);
		return dto;
	}
	@Override
	public EmpDTO selectOneEmpno2(EmpDTO empDTO) {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectEmpno2", empDTO);
		System.out.println("EmpDAOImpl selectOneEmpno2: "+ dto);
		return dto;
	}
	
	public int updateEmp(EmpDTO empDTO) {
		int countUpdate = -1;
		try {
			countUpdate = sqlSession.update("mapper.emp.modify_Empno", empDTO);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return countUpdate;
	}
	
	public int insertEmp(EmpDTO empDTO) {
		int countUpdate = -1;
		try {
			countUpdate = sqlSession.insert("mapper.emp.insert_Empno", empDTO);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return countUpdate;
	}
	
	public int deleteEmp(EmpDTO empDTO) {
		int countUpdate = -1;
		try {
			countUpdate = sqlSession.delete("mapper.emp.delete_Empno", empDTO);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return countUpdate;
	}
	
	
}
