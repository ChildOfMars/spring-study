package com;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.config.MyConfig;
import com.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class Test {
	@Autowired
	private StudentService studentService;
	
	@org.junit.Test
	public void testCalculate() {
		boolean flag = studentService.calculate(1);
		System.out.println(flag);
	}
}
