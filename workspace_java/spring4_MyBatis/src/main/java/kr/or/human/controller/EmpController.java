package kr.or.human.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.or.human.dto.EmpDTO;
import kr.or.human.service.EmpService;

@Controller
public class EmpController {

	
	@RequestMapping(value = "/emp", method=RequestMethod.GET)
	public String listEmp() {
		
		return "emp";
		
	}
	
	@Autowired
	EmpService empService;
	
	@RequestMapping("/emplist")
	public ModelAndView empList() {

		ModelAndView mav = new ModelAndView("empList");
		List list = empService.getEmpList();
		
		mav.addObject("list", list);
		
		return mav;
	}
	
	
	@RequestMapping("/empOne")
	public ModelAndView empOne() {

		ModelAndView mav = new ModelAndView("empOne");
		EmpDTO dto = empService.getEmpOne();
		
		mav.addObject("dto", dto);
		
		return mav;
	}
	
	@RequestMapping("/empno")
	public ModelAndView empno() {

		ModelAndView mav = new ModelAndView("empno");
		EmpDTO dto = empService.getEmpOne();
		
		mav.addObject("dto", dto);
		
		return mav;
	}
	
	@RequestMapping("/emplist2")
	public ModelAndView empList2() {

		ModelAndView mav = new ModelAndView("empList2");
		List list = empService.getEmpList();
		
		mav.addObject("list", list);
		
		return mav;
	}
	
	
	@RequestMapping("/empno2")
	public ModelAndView empno2(
			@ModelAttribute
			EmpDTO empDTO,
			Model model
			) {

		ModelAndView mav = new ModelAndView("empno2");
		EmpDTO dto = empService.getEmpno2(empDTO);
		
		mav.addObject("dto", dto);
		
		return mav;
	}
	
//	@RequestMapping(value = "/emp", method=RequestMethod.PUT)
//	public String modifyEmp(Model model) {
//		// 실제로 update 실행하는 곳
//	}
	
}
