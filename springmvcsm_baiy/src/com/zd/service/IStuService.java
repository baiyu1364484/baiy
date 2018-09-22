package com.zd.service;

import java.util.List;

import com.zd.entity.Stu;

public interface IStuService {

	//查询全部
	public List<Stu> selAll();
	
	//添加
	public void add(Stu stu);
	
	//删除
	public void delete(int sid);
	
	//查单条
	public Stu selOne(int sid);
	
	//修改
	public void update(Stu stu);
}
