package com.ssh.service;

import java.util.List;

import com.ssh.bean.User;

public interface IUserService {
	List<User> findUserList();
}
