package com;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.Student;
import com.config.MyConfig;
import com.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:beans.xml")
@ContextConfiguration(classes=MyConfig.class)
public class Test {
	@Autowired
	private StudentService studentService;

	@org.junit.Test
	public void testAddStudent() {
		Student student = new Student();
		student.setSname("李四");
		student.setPassword("123456");
		student.setAge(20);
		student.setMajor("软件工程");
		student.setStatus(1);
		int count = studentService.addStudent(student);
		System.out.println(count);
	}
}
