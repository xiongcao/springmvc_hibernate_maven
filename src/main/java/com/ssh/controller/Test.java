package com.ssh.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.ssh.bean.User;
import com.ssh.service.IUserService;
import com.ssh.utils.BaseResult;
import com.ssh.utils.TmStringUtils;


@Controller
@RequestMapping("/test")
public class Test {
	@Autowired
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping(value = "/userInfo",method = RequestMethod.GET)
	public String getUserInfo(){
		List<User> users = userService.findUserList();
		return BaseResult.success(users);
	}
	
	@ResponseBody
	@RequestMapping(value = "/userInfo",method = RequestMethod.POST)
	public String addUserInfo(User user){
		Serializable serializable = userService.addUserInfo(user);
		if(TmStringUtils.isNotEmpty(serializable)) {
			return BaseResult.success();
		}
		return BaseResult.failure("添加失败 ");
	}
	
	@ResponseBody
	@RequestMapping(value = "/userInfo/{id}/{status}",method = RequestMethod.PUT)
	public String updateUserInfo(@PathVariable("id") Integer id,@PathVariable("status") Integer status){
		Integer num = userService.updateUserInfo(id,status);
		if(num!=0) {
			return BaseResult.success();
		}
		return BaseResult.failure(num.toString());
	}
	
	@ResponseBody
	@RequestMapping(value = "/userInfo/{id}",method = RequestMethod.DELETE)
	public String delUserInfo(@PathVariable("id") Integer id){
		Integer num = userService.delByIdUser(id);
		if(num!=0) {
			return BaseResult.success();
		}
		return BaseResult.failure(num.toString());
	}
}











