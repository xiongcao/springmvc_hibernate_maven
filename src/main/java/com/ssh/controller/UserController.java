package com.ssh.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ssh.bean.User;
import com.ssh.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@ResponseBody()
	@RequestMapping(value = "/findUserList")
	public ModelAndView findUserList(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView("user/user");
		List<User> users = userService.findUserList();
		for (User user : users) {
			System.out.println(user.getName());
		}
		modelAndView.addObject("userInfos", users);
		return modelAndView;
	}

}
