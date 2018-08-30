package com.ssh.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		return dao.findBySQL(User.class, "select * from tb_user");
	}

	@Override
	public Serializable addUserInfo(User user) {
		return dao.save(user);
	}

	@Override
	public Integer delByIdUser(Integer id) {
		String sql = "update tb_user set status = 0 where id = :id";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		return dao.executeSql(sql,params);
	}

	@Override
	public Integer updateUserInfo(Integer id,Integer status) {
		String sql = "update tb_user set status = :status where id = :id";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("status", status);
		params.put("id", id);
		return dao.executeSql(sql,params);
	}

	
}
