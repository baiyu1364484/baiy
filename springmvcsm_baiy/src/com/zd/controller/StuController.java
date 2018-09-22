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

	//查询全部
	@RequestMapping("/selAll")
	public String selAll(Map map){
		Logger logger = 
			LoggerFactory.getLogger(StuController.class);
		try {
			List<Stu> list = stuService.selAll();
			map.put("list", list);
			return "stu";
		} catch (Exception e) {
			logger.warn("查失败", e);
		}
		return "stu";
	}
	
	//去添加
	@RequestMapping("/toAdd")
	public String toAdd(){
		return "add";
	}
	
	//添加
	@RequestMapping("/add")
	public String add(Stu stu){
		Logger logger = 
			LoggerFactory.getLogger(StuController.class);
		try {
			stuService.add(stu);
			return "redirect:selAll";
		} catch (Exception e) {
			logger.warn("添加失败", e);
		}
		return "redirect:selAll";
	}
	
	//删除
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(int sid){
		Logger logger = 
			LoggerFactory.getLogger(StuController.class);
		try {
			stuService.delete(sid);
			return "1";
		} catch (Exception e) {
			logger.warn("删除失败", e);
		}
		return "1";
	}
	
	//查单条
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
			logger.warn("查单失败", e);
		}
		return "toupdate";
		
		
		
	}
	
	//修改
	@RequestMapping("/update")
	public String update(Stu stu){
		Logger logger = 
			LoggerFactory.getLogger(StuController.class);
		try {
			stuService.update(stu);
			return "redirect:selAll";
		} catch (Exception e) {
			logger.warn("修改失败", e);
		}
		return "redirect:selAll";
		
		
	}
	
	
	
	
	@Autowired
	private IStuService stuService;
}
