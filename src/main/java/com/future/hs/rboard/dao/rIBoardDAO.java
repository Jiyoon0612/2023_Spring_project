package com.future.hs.rboard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.future.hs.rboard.vo.rBoardVO;

@Mapper
public interface rIBoardDAO {
	public List<rBoardVO> getrBoardList();
	public List<rBoardVO> getrBoardList2();
	public List<rBoardVO> getrBoardList3();
}

