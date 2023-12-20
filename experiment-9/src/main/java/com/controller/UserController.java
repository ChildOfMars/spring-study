package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@RequestMapping(value = "/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String login(String username,String password,HttpServletRequest request) {
		
		if (username.equals("admin") && password.equals("123")) {
			request.getSession().setAttribute("username", username);
			throw new RuntimeException("@ExceptionHandler ,运行时异常");
			
		}
		return "login";
	}
	
	@ExceptionHandler(value = {RuntimeException.class})
	public String handlerException(Exception e, HttpServletRequest request) {
		request.setAttribute("message", e.getMessage());
		return "error";
	}
}
