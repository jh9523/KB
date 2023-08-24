package com.mulcam.kb04;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mulcam.kb04.dto.MemberDto;

@Controller
public class MemberController {
	
	@PostMapping("/login_action")
	public String login_action(
			@RequestParam String mid,
			@RequestParam String passwd,
			Model model
			) {
		if( ! mid.equals("abc")) {
			model.addAttribute("errmsg", "�α��� ����");
			return "member/login_form";
		}
		if( ! passwd.equals("123")) {
			model.addAttribute("errmsg", "�α��� ����");
			return "member/login_form";
		}
		
		return "redirect:/login_member";
	}
	
	@GetMapping("/login_form")
	public String login_form() {
		return "member/login_form";
	}
	
	@GetMapping("/login_main")
	public String login_main(HttpSession session) {
		
		String mid = (String) session.getAttribute("mid");
		if( mid != null ) {//�α����� ���¶�� /login_member�� �����̷���
			return "redirect:/login_member";
		}
		
		return "member/login_main";
	}
	
	
	//ȸ��������
	@GetMapping("/member_insert_form")
	public String member_insert_form() {
	
		return "member/insert_form";
	}
	
	//ȸ�����
	@PostMapping("/member_insert_action")
	public String member_insert_action(MemberDto dto) {
		
		System.out.println("dto="+dto);
		
		return "member/insert_ok";
	}
	
}