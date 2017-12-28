package com.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.bean.User;
import com.ssh.dao.IHibernateDao;
import com.ssh.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IHibernateDao<User> dao;
	
	@Override
	@Transactional
	public List<User> findUserList() {
//		return dao.find("FROM User");
		return dao.findBySQL(User.class, "select * from tb_user");
	}

}
