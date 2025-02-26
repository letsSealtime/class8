package sec01.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		System.out.println(list.isEmpty());
		
		// 추가
		list.add(10);
		list.add("글씨");
		
		// 중간에 삽입
		list.add(1,123);
		System.out.println(list);
		//toString 때문에 이쁘게 나옴
		
		// 삭제
		list.remove(1);
		System.out.println(list);
		
		// 읽기
		int a = (int)list.get(0);
		
		// 초기화
//		list.clear();
		list = new ArrayList(); // 보통 이 방법을 주로 사용
		
		map = new HashMap();
		map.put("제목", "바람이 분다");
		map.put("가수", "이소라");
		list.add(map);
		
		
		
		
		
		
	}

}
