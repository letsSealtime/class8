package kr.or.human.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.or.human.dto.EmpDTO;
import kr.or.human.service.EmpService;

@Controller
public class EmpController {

	
	@RequestMapping(value="/emp", method=RequestMethod.GET)
	public String listEmp(Model model) {
		
		List<EmpDTO> list = empService.getEmpList();
		System.out.println("list.size : "+ list.size());
		
		model.addAttribute("list", list);
		
		return "empList";
	}
	
	@Autowired
	EmpService empService;
	
	
	@RequestMapping("/empOne")
	public ModelAndView empOne() {

		ModelAndView mav = new ModelAndView("empOne");
		EmpDTO dto = empService.getEmpOne();
		
		mav.addObject("dto", dto);
		
		return mav;
	}
	
	@RequestMapping(value="/empno", method=RequestMethod.GET)
	public String empno(
			@RequestParam("empno")
			int empno
	) {
		EmpDTO dto = empService.getEmpno(empno);
		System.out.println("conroller dto : "+ dto);
		return "emp";
	}
	
	
	@RequestMapping(value="/detailEmp", method=RequestMethod.GET)
	public String empno2(
			@ModelAttribute
			EmpDTO empDTO,
			
			Model model
			) {
		EmpDTO dto = empService.getEmpno2(empDTO);
		System.out.println("controller empno2 : "+ dto);
		model.addAttribute("dto", dto);
		return "detailEmp";
	}
	
	@RequestMapping(value="/modifyEmp", method=RequestMethod.GET)
	public String modifyEmp(
			@ModelAttribute
			EmpDTO empDTO,
			
			Model model
			) {
		EmpDTO dto = empService.getEmpno2(empDTO);
		model.addAttribute("dto", dto);
		return "modifyEmp";
	}
	
	@RequestMapping(value="/emp", method=RequestMethod.POST)
	public String modifyEmp2(Model model,
			@ModelAttribute EmpDTO empDTO
	) {
		System.out.println(empDTO);
		int countUpdate = empService.modifyEmp(empDTO);
		System.out.println("업뎃! : "+ countUpdate);
		
		return "redirect:emp";
	}
	
	// value = spring이 연결하는 메소드 이름 (PK),
	// 메소드 = POST로 연결한다. (다 받아주고 싶으면 지움)
	// redirect : 새로고침 
	// Model = request 주머니 ( 아무거나 설정할 수 있다.) 
	// @modelAtrribute = setter 

	
	// 삽입
	
	@RequestMapping(value="/insertEmp", method=RequestMethod.GET)
	public String insertEmp2(
			@ModelAttribute
			EmpDTO empDTO
			) {
		return "insertEmp";
	}
	
	@RequestMapping(value="/insertEmp2", method=RequestMethod.POST)
	public String insertEmp(
			@ModelAttribute
			EmpDTO empDTO
			) {
		int CountUpdate = empService.insertEmp(empDTO);
		System.out.println("등록 결과 : " + CountUpdate);
		return "redirect:emp";
	}
	
	@RequestMapping(value="/deleteEmp", method=RequestMethod.GET)
	public String deleteEmp(
			@ModelAttribute
			EmpDTO empDTO
			) {
		int CountUpdate = empService.deleteEmp(empDTO);
		System.out.println("삭제 결과" + CountUpdate);
		return "redirect:emp";
	}	
	
	@RequestMapping(value="/joinEmp", method=RequestMethod.GET )
	public String joinEmp() {
		return "joinEmp";
	}
	
	@ResponseBody
	@RequestMapping(value="/joinEmp", method=RequestMethod.POST )
	public   int joinEmpPost(
		@RequestBody	
		EmpDTO empDTO
	) {
		// 전달 받고
		// 확인하고
		System.out.println("[POST] joinEmp empDTO : "+ empDTO);
		// db에 넣기
		int count = empService.joinEmp(empDTO);
		System.out.println("추가 결과 : "+ count);
		return count;
	}
	@RequestMapping(value="/retireEmp", method=RequestMethod.GET )
	public String retireEmp(
			EmpDTO empDTO
	) {
		// 전달 받고
		// 확인하고
		System.out.println("[GET] retireEmp empDTO : "+ empDTO);
		// db에 넣기
		int count = empService.retireEmp(empDTO);
		System.out.println("삭제 결과 : "+ count);
		
		return "redirect:emp";
	}
}
	
