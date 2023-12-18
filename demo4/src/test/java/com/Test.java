package com;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.Student;
import com.config.MyConfig;
import com.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MyConfig.class)
public class Test {
	@Autowired
	private StudentService studentService;

	@org.junit.Test
	public void testSaveStudent() {
		Student student = new Student();
		student.setSname("周珊羽");
		student.setPassword("123456");
		student.setAge(21);
		student.setMajor("JavaEE");
		student.setStatus(1);
		int count = studentService.saveStudent(student);
		System.out.println(count);
	}
}
