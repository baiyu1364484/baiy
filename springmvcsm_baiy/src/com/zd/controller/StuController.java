package com.zd.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zd.entity.Stu;
import com.zd.service.IStuService;

@Controller
public class StuController {

	//��ѯȫ��
	@RequestMapping("/selAll")
	public String selAll(Map map){
		Logger logger = 
			LoggerFactory.getLogger(StuController.class);
		try {
			List<Stu> list = stuService.selAll();
			map.put("list", list);
			return "stu";
		} catch (Exception e) {
			logger.warn("��ʧ��", e);
		}
		return "stu";
	}
	
	//ȥ���
	@RequestMapping("/toAdd")
	public String toAdd(){
		return "add";
	}
	
	//���
	@RequestMapping("/add")
	public String add(Stu stu){
		Logger logger = 
			LoggerFactory.getLogger(StuController.class);
		try {
			stuService.add(stu);
			return "redirect:selAll";
		} catch (Exception e) {
			logger.warn("���ʧ��", e);
		}
		return "redirect:selAll";
	}
	
	//ɾ��
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(int sid){
		Logger logger = 
			LoggerFactory.getLogger(StuController.class);
		try {
			stuService.delete(sid);
			return "1";
		} catch (Exception e) {
			logger.warn("ɾ��ʧ��", e);
		}
		return "1";
	}
	
	//�鵥��
	@RequestMapping("/selOne")
	public String selOne(int sid,Map map){
		Logger logger = 
			LoggerFactory.getLogger(StuController.class);
		try {
			Stu stu = stuService.selOne(sid);
			System.out.println(stu);
			map.put("stu", stu);
			return "toupdate";
		} catch (Exception e) {
			logger.warn("�鵥ʧ��", e);
		}
		return "toupdate";
		
		
		
	}
	
	//�޸�
	@RequestMapping("/update")
	public String update(Stu stu){
		Logger logger = 
			LoggerFactory.getLogger(StuController.class);
		try {
			stuService.update(stu);
			return "redirect:selAll";
		} catch (Exception e) {
			logger.warn("�޸�ʧ��", e);
		}
		return "redirect:selAll";
		
		
	}
	
	
	
	
	@Autowired
	private IStuService stuService;
}
