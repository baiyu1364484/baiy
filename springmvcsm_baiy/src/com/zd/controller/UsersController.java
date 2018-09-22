package com.zd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zd.entity.Users;
import com.zd.service.IUsersService;

@Controller
public class UsersController {

	//ȥ��½
	@RequestMapping("/tologin")
	public String tologin(){
		return "login";
	}
	
	//��¼
	@RequestMapping("/login")
	public String login(Users users){
		Logger logger = 
			LoggerFactory.getLogger(UsersController.class);
		try {
			Users user = usersService.login(users);
			if(user!=null){
				
				return "redirect:selAll";
			}else{
				return "forward:tologin";
			}
		} catch (Exception e) {
			logger.warn("��¼ʧ��", e);
		}
		return "redirect:tologin";
	}
	
	
	@Autowired
	private IUsersService usersService;
}
