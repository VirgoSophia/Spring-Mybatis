package com.atguigu.sm.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.sm.entities.User;
import com.atguigu.sm.services.UserService;

public class Test01 {

	private ApplicationContext ctx = null;
	private UserService userService = null;
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		userService = ctx.getBean(UserService.class);
	}
	
	@Test
	public void test01(){
		User user = new User();
		user.setName("sunth");
		user.setAge(25);
		userService.add(user);		
	}
	
}
