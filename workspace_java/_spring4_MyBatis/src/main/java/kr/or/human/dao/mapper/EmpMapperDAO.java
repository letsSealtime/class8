package kr.or.human.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import kr.or.human.dto.EmpDTO;

@Mapper
public interface EmpMapperDAO {

	List<EmpDTO> selectEmp();
	
	@Select("select * from emp2 where empno = #{empno}")
	List<EmpDTO> selectDetailEmp(@Param("empno") int empno);
	
	// xml의 id와 DAO의 메소드명을 같게 한다.
	// xml의 namespace의 패키지, 폴더명을 적는다.
}
