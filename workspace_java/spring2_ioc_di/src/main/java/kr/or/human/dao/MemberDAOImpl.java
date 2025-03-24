package kr.or.human.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

// Bean Id 를 지정하는 방법
// Id를 지정하지 않은 경우,
// 클래스명인데 맨 앞글자만 소문자인 ID 자동생성
@Repository("memberDAOImpl")
public class MemberDAOImpl implements MemberDAO {

	@Override
	public List selectList() {
		
		
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		return list;
	}

}
