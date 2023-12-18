package com.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.User;

@Controller
public class UserController {

	@RequestMapping("/modelAndView")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello Spring MVC ModelAndView");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/model")
	public String login(Model model) {
		model.addAttribute("message", "Hello Spring MVC Model");
		return "index";
	}
	
	@RequestMapping("/request")
	public String request(HttpServletRequest request) {
		request.setAttribute("message", "Hello Spring MVC Request");
		return "index";
	}
	
	@RequestMapping(value="/string", produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String string() {
		return "Hello Spring MVC String";
	}
	
	@RequestMapping(value="/json", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String json() throws JsonProcessingException {
		User user = new User();
		user.setUsername("admin");
		user.setPassword("123456");
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(user);
	}
	
	@RequestMapping(value="/object", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public User object() {
		User user = new User();
		user.setUsername("admin");
		user.setPassword("123456");
		return user;
	}
	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
	@RequestMapping(value="/fileUpload",method=RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public String fileUpload(MultipartFile file,HttpServletRequest request) throws IOException {
		System.out.println(file.getOriginalFilename());
		file.transferTo(new File(request.getServletContext().getRealPath("/upload")+"/"+file.getOriginalFilename()));
		request.setAttribute("message", "File Upload Success");
		return "form";
	}
	

	
	@RequestMapping(value="/multipleFileUpload",method=RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public String multipleFileUpload(MultipartFile[] files, HttpServletRequest request) throws IOException {
		for (MultipartFile file : files) {
			System.out.println(file.getOriginalFilename());
			file.transferTo(
					new File(request.getServletContext().getRealPath("/upload") + "/" + file.getOriginalFilename()));
		}
		request.setAttribute("message", "Multiple File Upload Success");
		return "form";
	}
}
