package com.rj.bd.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rj.bd.base.BaseController;
import com.rj.bd.member.entity.Member;
import com.rj.bd.member.service.IMemberService;


@Controller
@RequestMapping("/member")
public class MemberController extends BaseController{
	
	@Autowired
	public IMemberService memberService;
	
	
	
	
	
	
	@RequestMapping("/query")
	@ResponseBody
	public List<Member> query(HttpServletRequest request,HttpServletResponse response){
		
		System.out.println("query");
		List<Member> list = memberService.findAll();
		
		
		return list;
		
		
		
		
	}
	
	

}
