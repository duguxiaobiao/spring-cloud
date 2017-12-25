package com.lonely.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lonely.cloud.dao.UserDao;
import com.lonely.cloud.eneity.User;

/**
 * user controller
 * 
 * @author 15072
 * @date 2017年12月18日下午7:57:00
 */
@RestController
public class UserController {

	@Autowired
	private UserDao userDao;

	@GetMapping("/simple/{id}")
	public User findById(@PathVariable Long id) {
		return this.userDao.findOne(id);
	}

}
