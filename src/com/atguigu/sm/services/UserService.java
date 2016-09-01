package com.atguigu.sm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.sm.entities.User;
import com.atguigu.sm.mappers.UserMapper;

@Service
@Transactional(readOnly=true)
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false,rollbackFor=Exception.class)
	public void add(User user){
		userMapper.add(user);
		int a = 10/0;
	}
}
