package com.ssh;


import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssh.bean.User;
import com.ssh.service.IUserService;

public class UserControllerTest extends TestBase{

	@Autowired
	IUserService userService;
	
	@Test
	public void testFindUserInfos(){
		List<User> users = userService.findUserList();
		for (User user : users) {
			System.out.println(user.getName());
		}
	}

}
