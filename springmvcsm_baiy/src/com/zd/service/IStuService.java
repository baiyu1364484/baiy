package com.zd.service;

import java.util.List;

import com.zd.entity.Stu;

public interface IStuService {

	//��ѯȫ��
	public List<Stu> selAll();
	
	//���
	public void add(Stu stu);
	
	//ɾ��
	public void delete(int sid);
	
	//�鵥��
	public Stu selOne(int sid);
	
	//�޸�
	public void update(Stu stu);
}
