package com.ssh.service;

import java.io.Serializable;
import java.util.List;

import com.ssh.bean.User;

public interface IUserService {
	List<User> findUserList();
	
	Serializable addUserInfo(User user);
	
	Integer delByIdUser(Integer id);
	
	Integer updateUserInfo(Integer id, Integer status);
}
