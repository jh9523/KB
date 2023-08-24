package com.mulcam.hangman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HangManController {
	
	@GetMapping("/hangman_game")
	public String hangman_game(
			
			) {
		
		return "hangman/hangman_gaming";
	}
	
	
}
