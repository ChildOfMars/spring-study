package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pojo.Leave;

@Controller
public class LeaveController {
	
	@RequestMapping("/form")
	public String userForm() {
		return "form";
	}
	
	@RequestMapping(value="/leave",method = RequestMethod.POST)
	public String registy(Leave leave) {
		System.out.println(leave);
		return "form";
	}
	
}
