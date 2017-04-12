package com.service;

import java.util.HashMap;

public interface UserService {
	
	public int isLogin(String username,String password);
	public HashMap<String,String> getUserById(int id);

}
