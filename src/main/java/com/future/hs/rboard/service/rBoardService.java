package com.future.hs.rboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.future.hs.board.dao.IBoardDAO;
import com.future.hs.rboard.dao.rIBoardDAO;
import com.future.hs.rboard.vo.rBoardVO;



@Service
public class rBoardService {
	@Autowired
	rIBoardDAO dao;
	
	public List<rBoardVO> getrBoardList(){
		List<rBoardVO> result = dao.getrBoardList();
		System.out.println(result);
		return result;
	}
	public List<rBoardVO> getrBoardList2(){
		List<rBoardVO> result = dao.getrBoardList2();
		System.out.println(result);
		return result;
	}
	public List<rBoardVO> getrBoardList3(){
		List<rBoardVO> result = dao.getrBoardList3();
		System.out.println(result);
		return result;
	}

}
