package kr.or.human5.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human5.dto.MemberDTO;

@Controller
public class MesController {

	String id = "admin";
	String pw = "1234";
	String name = "관리자";
	
	
	@RequestMapping("/login")
	public String login() {
		
		
		return "login";
	}

	@RequestMapping("/loginCheck")
	public String loginCheck(MemberDTO dto, HttpServletRequest req) {
		
		if(dto.getId().equals(this.id)
				&& dto.getPw().equals(this.pw)) {
			dto.setName(this.name);

			// 세션에 담기
			HttpSession session = req.getSession();
			session.setAttribute("dto", dto);
			
			// 만약 성공 시, main
			return "redirect:main";

		} else {
			
			// 실패 시, login 으로 이동
			return "redirect:login?msg=1";
			// jsp에서 상황에 맞는 메세지 출력 가능.
		}
	}
	
	@RequestMapping("/main")
	public String main(HttpServletRequest req) {
		
		// 로그인한 사람만 보기
		// 안 한 사람은 login으로 이동
		// 이 과정을 filter에서 이미 치뤘기 때문에 main만 덜렁.
		
//		HttpSession session = req.getSession();
//		MemberDTO dto = (MemberDTO)session.getAttribute("dto");
//		
//		if(dto == null) {
//			return "redirect:login?msg=2";
//		} else {
//			return "main";
//		}
		
		return "main";
	}
	
	@RequestMapping("/main2")
	public String main2(HttpServletRequest req) {
		
		// 로그인한 사람만 보기
		// 안 한 사람은 login으로 이동
		
//		HttpSession session = req.getSession();
//		MemberDTO dto = (MemberDTO)session.getAttribute("dto");
// 		이 과정을 filter에서 이미 치뤘기 때문에 main만 덜렁.
//		
//		if(dto == null) {
//			return "redirect:login?msg=2";
//		} else {
//			return "main2";
//		}
		
		return "main2";
	}
	
}
