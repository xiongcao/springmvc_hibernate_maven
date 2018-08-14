package com.ssh.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.ssh.bean.User;


@Controller
@RequestMapping("/test")
public class Test {
	@ResponseBody
	@RequestMapping(value = "/userInfo",method = RequestMethod.DELETE)
	public String getUserInfo(HttpServletRequest request,HttpServletResponse response){
		User user = new User();
		user.setId(1);
		user.setName("java");
		user.setPassword("123456");
		user.setLoginDate("2018-08-14");
		return JSONObject.toJSONString(user);
	}
}











