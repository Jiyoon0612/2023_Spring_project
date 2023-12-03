package com.future.hs.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.future.hs.member.dao.IMemberDAO;
import com.future.hs.member.vo.MemberVO;

@Service
public class MemberService {
	
	
	@Autowired
	IMemberDAO dao;
	
	public void registMember(MemberVO member) throws Exception {
			int result = dao.registMember(member);
			if(result == 0) {
				throw new Exception();
			}
	}
	
	public MemberVO loginMember(MemberVO member) {
		MemberVO result = dao.loginMember(member);
		if(result == null) {
			return null;
		}
		return result;
	}
	
}