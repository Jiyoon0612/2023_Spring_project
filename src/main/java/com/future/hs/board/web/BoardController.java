package com.future.hs.board.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.future.hs.board.service.BoardService;
import com.future.hs.board.vo.BoardVO;


@Controller
public class BoardController {
	
	@RequestMapping("/boardmain")
	public String registView() {
		return "board/boardmain";
	}

	@Autowired
	BoardService boardService; 
	
	@RequestMapping("/boardView")
	public String boardView(Model model, HttpSession session) {
		List<BoardVO> boardList = boardService.getBoardList();
		model.addAttribute("boardList", boardList);
		return "board/boardView";
	}
	@RequestMapping("/boardView2")
	public String boardView2(Model model, HttpSession session) {
		List<BoardVO> boardList2 = boardService.getBoardList2();
		model.addAttribute("boardList2", boardList2);
		return "board/boardView2";
	}
	@RequestMapping("/boardView3")
	public String boardView3(Model model, HttpSession session) {
		List<BoardVO> boardList3 = boardService.getBoardList3();
		model.addAttribute("boardList3", boardList3);
		return "board/boardView3";
	}
}

