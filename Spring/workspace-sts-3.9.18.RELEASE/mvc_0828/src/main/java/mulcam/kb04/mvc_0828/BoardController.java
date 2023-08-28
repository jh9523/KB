package mulcam.kb04.mvc_0828;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mybatis.dto.BoardDto;

@Controller
public class BoardController {
	@Autowired
	private SqlSession sqlSession;
	
	String ns = "config.BoardMapper.";

	@GetMapping("/board_list")
	public String board_list(Model model) {
		List<BoardDto> list = sqlSession.selectList(ns+"selectAll");
		
		model.addAttribute("board_list",list);
		return "board/list";
	}
	
	@GetMapping("/board_insert_form") //등록폼
	public String board_insert_form() {
		
		return "board/insert_form";
	}
	@PostMapping("/board_insert_action") //등록작업
	public String board_insert_action(BoardDto dto, Model model) {
		sqlSession.insert(ns+"insert", dto);
		
		model.addAttribute("msg","등록성공");
		return "board/insert_ok";
	}
	@GetMapping("/board_detail")
	public String board_detail(
			@RequestParam("no") int no, Model model) {
		BoardDto dto = sqlSession.selectOne(ns+"selectOne", no);
		
		model.addAttribute("dto",dto);	
		return "board/detail";
	}
	
	
}