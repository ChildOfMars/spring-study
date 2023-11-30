package com;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.Student;
import com.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentServiceTest {
	
	@Autowired
	private StudentService studentService;
	
	@org.junit.Test
	public void testStudent() {
		Student stu = new Student();
		studentService.save(stu);
	}
}
