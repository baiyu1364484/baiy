package com.zd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zd.dao.IStuDao;
import com.zd.entity.Stu;
import com.zd.service.IStuService;

@Service
public class StuService implements IStuService {

	//��ѯȫ��
	public List<Stu> selAll(){
		return stuDao.selAll();
	}
	
	//���
	public void add(Stu stu){
		stuDao.add(stu);
	}
	
	//ɾ��
	public void delete(int sid){
		stuDao.delete(sid);
	}
	
	//�鵥��
	public Stu selOne(int sid){
		return stuDao.selOne(sid);
	}
	
	//�޸�
	public void update(Stu stu){
		stuDao.update(stu);
	}
	
	@Autowired
	private IStuDao stuDao;
}
