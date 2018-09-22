package com.zd.dao;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.zd.entity.Users;

public interface IUsersDao {

	//µÇÂ¼
	@Select("select * from users where username=#{username} and userpwd=#{userpwd}")
	@ResultMap("usersMapper")
	public Users login(Users users);
}
