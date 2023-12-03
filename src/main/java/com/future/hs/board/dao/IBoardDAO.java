package com.future.hs.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.future.hs.board.vo.BoardVO;

@Mapper
public interface IBoardDAO {
	public List<BoardVO> getBoardList();
	public List<BoardVO> getBoardList2();
	public List<BoardVO> getBoardList3();
}

