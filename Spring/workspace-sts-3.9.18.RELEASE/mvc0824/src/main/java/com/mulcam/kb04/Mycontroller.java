package com.mulcam.kb04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroller {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("msg","�ȳ��ϼ���");
		return "hello";	// -> �ȳ��ϼ��� ����ϵ��� �ϼ��ϼ���~
	}
}
