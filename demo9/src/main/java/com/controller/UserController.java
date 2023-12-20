package com.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String username,String password,HttpServletRequest request) {
		if (username.equals("admin") && password.equals("123")) {
			request.getSession().setAttribute("token", UUID.randomUUID().toString());
			return "index";
		}
		return "login";
	}
}
