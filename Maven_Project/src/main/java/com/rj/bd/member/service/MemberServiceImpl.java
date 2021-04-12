package com.rj.bd.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rj.bd.member.dao.MemberMapper;
import com.rj.bd.member.entity.Member;

@Service("memberService")
public class MemberServiceImpl implements IMemberService {
	
	@Autowired
	public MemberMapper memberMapper;

	public List<Member> findAll() {
		return memberMapper.findAll();
	}



}
