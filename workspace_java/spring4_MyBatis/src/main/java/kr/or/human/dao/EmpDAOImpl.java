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
	
	
	void getSeq() {
		int seq = sqlSession.selectOne("mapper.emp.getSeq");
		
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(seq);
		dto.setEname("임의");
		// insert에 보내서 테이블 a에서 seq 사용
		// insert에 보내서 테이블 b에서 seq 사용
		
	}

	
	@Override
	public List<EmpDTO> selectEmpSearchList(EmpDTO dto) {
		List<EmpDTO> result = sqlSession.selectList("mapper.emp.dynamic.selectEmp", dto);
		System.out.println("result : "+ result);
		return result;
	}
	
}
