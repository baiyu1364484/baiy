package com.zd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zd.dao.IStuDao;
import com.zd.entity.Stu;
import com.zd.service.IStuService;

@Service
public class StuService implements IStuService {

	//查询全部
	public List<Stu> selAll(){
		return stuDao.selAll();
	}
	
	//添加
	public void add(Stu stu){
		stuDao.add(stu);
	}
	
	//删除
	public void delete(int sid){
		stuDao.delete(sid);
	}
	
	//查单条
	public Stu selOne(int sid){
		return stuDao.selOne(sid);
	}
	
	//修改
	public void update(Stu stu){
		stuDao.update(stu);
	}
	
	@Autowired
	private IStuDao stuDao;
}
