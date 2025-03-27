package kr.or.human;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BookmarkController extends HttpServlet {

	@Autowired
	BookmarkService bookmarkService;
	
	@RequestMapping("/booklist")
	public ModelAndView bookList() {

		ModelAndView mav = new ModelAndView("bookList");
		List list = bookmarkService.addList();
		
		mav.addObject("list", list);
		
		return mav;
	}


//	@RequestMapping("/list")
//	public ModelAndView list() {
//
//		ModelAndView mav = new ModelAndView();
//		BookmarkDTO bookmarkDTO = new BookmarkDTO(); 
//		bookmarkService.addList();
//		bookmarkService.getList();
//
//		mav.addObject("dto", bookmarkDTO);
//		
//		return mav;
//
//	}

}
