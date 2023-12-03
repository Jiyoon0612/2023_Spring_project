package com.future.hs.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.future.hs.board.dao.IBoardDAO;
import com.future.hs.board.vo.BoardVO;

@Service
public class BoardService {
	@Autowired
	IBoardDAO dao;
	
	public List<BoardVO> getBoardList(){
		List<BoardVO> result = dao.getBoardList();
		System.out.println(result);
		return result;
	}
	public List<BoardVO> getBoardList2(){
		List<BoardVO> result = dao.getBoardList2();
		System.out.println(result);
		return result;
	}
	public List<BoardVO> getBoardList3(){
		List<BoardVO> result = dao.getBoardList3();
		System.out.println(result);
		return result;
	}

}
