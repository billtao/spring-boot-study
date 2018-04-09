package com.powerich.dao;

import org.springframework.data.repository.CrudRepository;

import com.powerich.vo.User;

public interface UserDao extends CrudRepository<User,Long> {
	
}
