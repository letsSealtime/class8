package kr.or.human.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.or.human.dao.MemberDAO;
import kr.or.human.dao.MemberDAOImpl;
import kr.or.human.dao.MemberDAOImpl2;

@Service
public class MemberServiceImpl implements MemberService{
	MemberServiceImpl(){
		System.out.println("MemberServiceImpl 실행");
	}
	
// Autowired의 대상 Bean의 후보가 두 개 이상이라면
	// 1. Qualifier(bean id) 에 해당하는 객체 찾기.
	// 2. @primanry 객체 찾기
	// 3. 둘 다 없으면 변수명과 bean id가 같은 것 찾기 
	
	@Autowired
//	@Qualifier("memberDAOImpl") 특정해 가져오는 것.
	MemberDAO memberDAO;
	
	
	// @Autowired, @Resource, @Inject 비슷하게 IoC, DI를 해준다.
	
	
	@Override
	public List getList() {
		
//		MemberDAO memberDAO = new MemberDAOImpl();
//		MemberDAO memberDAO = new MemberDAOImpl2();
		
		List list = memberDAO.selectList();
		
		return list;
		
	}

	
	
}
