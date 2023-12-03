package com.future.hs.member.dao;

import org.apache.ibatis.annotations.Mapper;

import com.future.hs.member.vo.MemberVO;


@Mapper
public interface IMemberDAO {
	public int registMember(MemberVO member);
	public MemberVO loginMember(MemberVO member);
}
