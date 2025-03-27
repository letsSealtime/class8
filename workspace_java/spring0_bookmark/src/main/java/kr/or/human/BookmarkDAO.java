package kr.or.human;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BookmarkDAO {

	public List addList() {
		List bookList = new ArrayList();
		
		BookmarkDTO bookmarkDTO = new BookmarkDTO();
			bookmarkDTO.setTitle("프로젝트 헤일메리");
			bookmarkDTO.setCover("https://image.aladin.co.kr/product/27045/43/coversum/8925588730_2.jpg");
			bookmarkDTO.setAuthor("앤디 위어");
			bookmarkDTO.setPublisher("알에이치코리아(RHK)");
			bookmarkDTO.setPrice("19800");
			bookList.add(bookmarkDTO);
			
			BookmarkDTO bookmarkDTO2 = new BookmarkDTO();	
			bookmarkDTO2.setTitle("당신 인생의 이야기");
			bookmarkDTO2.setCover("https://image.aladin.co.kr/product/9401/86/coversum/k982635615_1.jpg");
			bookmarkDTO2.setAuthor("테드 창");
			bookmarkDTO2.setPublisher("엘리");
			bookmarkDTO2.setPrice("15300");
			bookList.add(bookmarkDTO2);
			
			BookmarkDTO bookmarkDTO3 = new BookmarkDTO();	
			bookmarkDTO3.setTitle("삼체 1~3 세트");
			bookmarkDTO3.setCover("https://image.aladin.co.kr/product/24394/37/coversum/s302934110_1.jpg");
			bookmarkDTO3.setAuthor("류츠신");
			bookmarkDTO3.setPublisher("자음과 모음");
			bookmarkDTO3.setPrice("60300");
			bookList.add(bookmarkDTO3);
		
			
			
		return bookList;
		
	}
	
}
