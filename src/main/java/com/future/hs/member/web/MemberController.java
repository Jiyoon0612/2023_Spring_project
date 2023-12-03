package com.future.hs.member.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.future.hs.member.service.MemberService;
import com.future.hs.member.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired 
	MemberService memberService; 
	
	@RequestMapping("/registView")
	public String registView() {
		return "member/registView";
	}
	@RequestMapping("/registDo")
	public String registDo(HttpServletRequest request) {
		String Nm = request.getParameter("nm");
		String Id = request.getParameter("id");
		String Pw = request.getParameter("pw");
		System.out.println(Nm);
		System.out.println(Id);
		System.out.println(Pw);
		MemberVO member = new MemberVO(Nm, Id, Pw);
		try {
			memberService.registMember(member);
		} catch (Exception e) {
			e.printStackTrace();
			return "errorView";
		}
		return "redirect:/";
	}
	@RequestMapping("/loginView")
	public String loginView() {
		return "member/loginView";
	}
	
	@RequestMapping("/loginDo")
	public String loginDo(MemberVO member, HttpSession session) {
		System.out.println(member);
		MemberVO login = memberService.loginMember(member);
		if(login == null) {
			return "redirect:/loginView?msg=N";
		}
		session.setAttribute("login", login);
		System.out.println();
		return "redirect:/";
	}
	
	@RequestMapping("/logoutDo")
	public String logoutDo(HttpSession session
			, HttpServletRequest request) {
		// 세션 종료
		session.invalidate();
		// 현재 요청이 어느 URL을 바라보는지 
		String requestToURL = request.getRequestURL().toString();
		System.out.println(requestToURL);
		String requestUrl = request.getHeader("Referer");
		System.out.println(requestUrl);
		return "redirect:" + requestUrl;
	}

	@RequestMapping("/home")
	public String home() {
		return "redirect:/";
	}
	@RequestMapping("/report")
	public String report() {
		return "re/report";
	}
}
