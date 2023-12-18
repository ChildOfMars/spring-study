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
		student.setSname("金秋英222");
		student.setPassword("jinqiuying222");
		student.setAge(21);
		student.setMajor("JavaEE222");
		student.setStatus(0);
		int count = studentService.addStudent(student);
		System.out.println(count);
	}
}
