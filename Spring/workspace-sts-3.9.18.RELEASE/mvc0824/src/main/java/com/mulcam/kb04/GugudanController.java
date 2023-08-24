package com.mulcam.kb04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GugudanController {
	
	@GetMapping("/gugudan_form")
	public String gugudan_form() {
		return "gugudan/gugudan_view";
	}
	
	@GetMapping("/gugudan_view")
	public String gugudan_view(
			@RequestParam(value = "dan") int num, Model model) {
		String result = num + " °á°ú´Â"+"<br>";
		for(int i = 1; i<10; i++) {
			result += num + " X " + i +" = " + num*i + "<br>";
		}
		model.addAttribute("result", result);
		return  "gugudan/gugudan_view";
		
		
	}
			
	
	
	
}
