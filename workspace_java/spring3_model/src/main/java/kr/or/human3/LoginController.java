package kr.or.human3;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	// 로그인 페이지 표시 
	@RequestMapping("/login.do")
	public ModelAndView loginForm() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		// servlet-context에 앞/뒤 주소 설정되어 있음.
		
		return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request) {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("result");
		
		
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println("아뒤 : " + id);	
		System.out.println("비번 : " + pw);	
		
		
		request.setAttribute("id1", id);
		
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("id2", id);
		
		
		// DTO에 아이디를 담고, 모델에 담아서, 출력
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		mav.addObject("dto", memberDTO);
		
		return mav;
	}
	
	
	@RequestMapping("/login2")
	public ModelAndView login2(
			// String id = request.getParameter("id")과 같음
			// 기본적으로 필수값. 없다면 400 Bad Request 코드 발생
//			즉 required는 true가 기본 값
//			@RequestParam("id")
			@RequestParam(value = "id", required=false)
			String id, 
			
			// parameter의  key와 변수명이 같다면 @RequestParam 생략 가능
//			@RequestParam을 생략하면 아래줄이 생략된다.
//			@RequestParam(value = "pw", required=false)
			String pw
			
			, String a // 안 줬으니 null 
//			(하지만 int는 null 이 못들어가서 500 오류)
			
			,
			@RequestParam
			Map map , 
			
			MemberDTO memberDTO
		) {

		ModelAndView mav = new ModelAndView("result");
		
		memberDTO.setId(id);
		mav.addObject("dto", memberDTO);
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println("map.id : " + map.get("id"));
		System.out.println("memberDTO : " + memberDTO);
		
		
		
		return mav;
		
	}
	
	@RequestMapping("/login3")
	public ModelAndView login3(
			
			//DTO에 알아서 넣어줌.
			@ModelAttribute
			MemberDTO dto1, 
			
			// mav.addObject("dto22", dto2);
			// DTO를 자동으로 채우고, 모델에 주기까지 한다.
			// 아랫줄 생략 가능
			@ModelAttribute("dto22")
			MemberDTO dto2,
			
			// DTO 타입의 앞글자만 소문자로 변경한 key로 
			// 모델에 넣어준다. 
			// = @ModelAttribute("memberDTO")
			// = mav.addObject("memberDTO", dto3);
			MemberDTO dto3
			
			
		) {

		System.out.println("dto : " + dto1);
		
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("dto1", dto1);
		
		return mav;
		
	}
	
	
}
