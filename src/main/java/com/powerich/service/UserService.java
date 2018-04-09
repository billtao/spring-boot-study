package com.powerich.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.powerich.dao.UserDao;
import com.powerich.dao.impl.UserDaoImpl;
import com.powerich.vo.User;

@Service
public class UserService {

	@Resource
	private UserDao userDao;
	@Resource
	private UserDaoImpl userDaoImpl;
	
	public void save(User user) {
		userDao.save(user);
	}
	
	public User getUserById(int id) {
		return userDaoImpl.getUserById(id);
	}
}
