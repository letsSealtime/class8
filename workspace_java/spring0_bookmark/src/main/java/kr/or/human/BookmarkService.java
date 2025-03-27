package kr.or.human;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookmarkService {

	@Autowired
	BookmarkDAO bookmarkDAO;

//	public List getList() {
//		List list = bookmarkDAO.selectList();
//
//		return list;
//
//	}

	public List addList() {
		List list = bookmarkDAO.addList();

		return list;

	}

}
