package com.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pojo.Test;
import com.pojo.TestDTO;
import com.pojo.User;

@Controller
public class TestController {
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public String test(TestDTO testDTO) {
		System.out.println(testDTO);
		return "index";
	}
	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
	@RequestMapping(value="/registry",method=RequestMethod.POST)
	public String registry(@RequestBody List<User> userList,
			HttpServletRequest request,
			HttpServletRequest response,
			HttpServletRequest session,
			@CookieValue("JSESSIONID") String cookie,
			@RequestHeader("Content-Type") String type) {
		request.setAttribute("userList", userList);
        System.out.println(userList);
        System.out.println("cookie="+cookie);
        System.out.println("Content-Type="+type);
        return "index";
    }
	
	@RequestMapping("/test_restful/{id}")
	public String testRestful(@PathVariable("id") Integer id) {
		System.out.println("Restful风格参数id="+id);
		return "index";
	}
}
