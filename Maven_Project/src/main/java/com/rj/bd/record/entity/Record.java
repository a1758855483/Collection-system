package com.rj.bd.record.entity;

import java.util.Date;

import com.rj.bd.user.entity.User;
import com.rj.bd.way.entity.Way;

import lombok.Data;

@Data
public class Record {

	
	public Integer cr_id;
	public String cr_money;
	public Date cr_time;
	public String cr_remark;
	public User user;
	public Way way;
	
	
	
	
	
	
	
}
