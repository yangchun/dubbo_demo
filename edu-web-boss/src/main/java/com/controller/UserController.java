package com.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.service.UserService;


public class UserController {
	@Autowired
	private UserService userService;
	
	public HashMap<String,String> getUserById(int id){
		return userService.getUserById(id);
	}
	
}
