package kr.or.human.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	
	
}
