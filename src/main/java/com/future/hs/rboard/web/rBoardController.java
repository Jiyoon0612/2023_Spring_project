package com.future.hs.rboard.web;

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
import com.future.hs.rboard.service.rBoardService;
import com.future.hs.rboard.vo.rBoardVO;

@Controller
public class rBoardController {

	@Autowired
	rBoardService boardrService; 
	
	@RequestMapping("/rboardView")
	public String rboardView(Model model, HttpSession session) {
		List<rBoardVO> rboardList = boardrService.getrBoardList();
		model.addAttribute("rboardList", rboardList);
		return "board/rboardView";
	}
	@RequestMapping("/rboardView2")
	public String rboardView2(Model model, HttpSession session) {
		List<rBoardVO> rboardList2 = boardrService.getrBoardList2();
		model.addAttribute("rboardList2", rboardList2);
		return "board/rboardView2";
	}
	@RequestMapping("/rboardView3")
	public String rboardView3(Model model, HttpSession session) {
		List<rBoardVO> rboardList3 = boardrService.getrBoardList3();
		model.addAttribute("rboardList3", rboardList3);
		return "board/rboardView3";
	}
}

