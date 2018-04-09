package com.powerich.dao.impl;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.powerich.vo.User;

public class UserDaoImpl {

	@Resource
	private JdbcTemplate jdbcTemplate;
	

	public User getUserById(int id) {
		User queryForObject = jdbcTemplate.queryForObject("select * from User where id =?", new BeanPropertyRowMapper<User>(User.class),id);
		System.out.println(queryForObject.toString());
		return queryForObject;
	}
	

}
