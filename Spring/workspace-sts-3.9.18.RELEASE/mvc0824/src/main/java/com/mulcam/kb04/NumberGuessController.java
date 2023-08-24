package com.mulcam.kb04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
/*���� ���߱� ���ӿ� ��Ʈ�ѷ� */
public class NumberGuessController {
	private int com_num = new java.util.Random().nextInt(100)+1;
	
	@GetMapping("/number_form")
	public String number_form() {
		
		return "number_guess/number_form";
	}
	
	@GetMapping("/number_check")
	public String number_check(
			@RequestParam(value = "num") int num, Model model) {
		String result = num+"";
		if(com_num == num) {
			result += "��ī��ī, �����Դϴ�";
		} else if(com_num < num) {
			result += "�����ּ���";
		} else {
			result += "�����ּ���";
		}
		model.addAttribute("result", result);
		return "number_guess/number_form";	// ���� ȭ�鿡 �ϴܿ� ��� ���
	}
	
}
