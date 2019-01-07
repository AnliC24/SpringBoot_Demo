package com.example.demo.controller;




import java.util.Date;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.User;


@RestController
@RequestMapping("/user")
public class UserController {
    
	@RequestMapping("/getUser")
	public Object user()
	{
	  User user=new User();
	  user.setName("cfwang");
	  user.setPassword("123456");
	  user.setAge(18);
	  user.setBirthday(new Date());
	  user.setDesc("hello spring boot--");
	  return user;
	}
}
