package com.service.impl;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	                    
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public int isLogin(String username, String password) {
		// TODO Auto-generated method stub
		return userDao.isLogin(username, password);
	}

	public HashMap<String, String> getUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.getUserById(id);
	}

}
