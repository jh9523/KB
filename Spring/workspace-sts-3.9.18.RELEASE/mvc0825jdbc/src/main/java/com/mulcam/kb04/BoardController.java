package com.mulcam.kb04;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mulcam.kb04.dao.BoardDao;
import com.mulcam.kb04.dto.BoardDto;

@Controller
public class BoardController {
	@Autowired
	private BoardDao boardDao;
	
	@GetMapping("/board_update")
	public String board_update_form(Model model,
			@RequestParam("no") int no) {
		
		BoardDto dto = boardDao.findByNo(no);
		model.addAttribute("dto", dto);
		
		return "board/update_form";
	}
	
	
	@GetMapping("/board_detail")
	public String board_detail(Model model,
			@RequestParam("no") int no) {
		
		BoardDto dto = boardDao.findByNo(no);
		model.addAttribute("dto", dto);
		
		return "board/detail";
	}
	
	@GetMapping("/board_list")
	public String board_list(Model model) {
		
		List<BoardDto> list = boardDao.list();
		model.addAttribute("board_list", list);
		return "board/list";
	}
	
	
	@PostMapping("/board_insert_action")
	public String board_insert_action( BoardDto dto, Model model ) {
		boardDao.insert(dto);
		model.addAttribute("msg", "�Խù� �߰� ����");
		return "board/insert_ok";
	}
	
	@GetMapping("/board_insert_form")
	public String board_insert_form() {
		return "board/insert_form";
	}
	
}