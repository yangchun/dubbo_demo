package com.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;
@Repository
public interface UserDao {
	public int isLogin(String username,String password);
	public HashMap<String,String> getUserById(int id);
}
