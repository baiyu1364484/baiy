package com.zd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zd.dao.IUsersDao;
import com.zd.entity.Users;
import com.zd.service.IUsersService;

@Service
public class UsersService implements IUsersService {

	//µÇÂ¼
	public Users login(Users users){
		return usersDao.login(users);
	}
	
	
	@Autowired
	private IUsersDao usersDao;
}
