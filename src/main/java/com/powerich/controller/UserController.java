package com.powerich.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.powerich.service.UserService;
import com.powerich.vo.User;

@RestController
public class UserController {
	
	@Resource
	private UserService userService;

	@RequestMapping("/getUser")
	public User getUser() {
		User user = new User(-1,"Eric","深圳",23);
		return user;
	}
	
	@RequestMapping("/save")
	public String saveUser() {
		User user = new User(-1,"Bob","Shenzhen",21);
		userService.save(user);
		return user.toString();
	}
	
	@RequestMapping("/getUserById/{id}")
	public String getUserByid(@PathVariable("id") int id) {
		User userById = userService.getUserById(id);
		return userById.toString();
	}
}
