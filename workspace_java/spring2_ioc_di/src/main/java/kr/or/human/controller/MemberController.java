package kr.or.human.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human.service.MemberService;
import kr.or.human.service.MemberServiceImpl;

@Controller
public class MemberController {
	
	MemberController(){
		System.out.println("MemberController 생성자 실행");
	}
	
	// IoC 
	// Inversion of Control
	// 제어의 역전
	// 타입에 맞는 클래스를 찾아서 대신 생성해준다.	
	// 정확히 동일한 클래스 또는 자동 형변환 되는 클래스
	
	// DI
	// Dependency Injection
	// 의존성 주입
	// IoC로 생성한 클래스를 변수에 넣어준다.  
	
	// 우선 순위
	// 1. 완전히 동일한 클래스
	// 2. 자동 형 변환이 가능한 클래스
	
	@Autowired
	MemberService memberService;
	// bean으로 등록된 애중에서, MemberService 데려옴
	
	@RequestMapping("/member")
	void listMember() {
		System.out.println("listMember 실행");

//		MemberService memberService = new MemberServiceImpl();
		List memberList = memberService.getList();

		System.out.println(memberList);
		
		return home;

	}
	
	
	
}
