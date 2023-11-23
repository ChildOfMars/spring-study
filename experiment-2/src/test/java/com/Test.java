package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;
import com.service.StudentService;

public class Test {
	
	@org.junit.Test
	public void testStaticFactory() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stu = context.getBean("student1",Student.class);
		System.out.println(stu.toString());
	}
	@org.junit.Test
	public void testDynamicFactory() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stu = context.getBean("student2",Student.class);
		System.out.println(stu.toString());
	}
	@org.junit.Test
	public void testPNamespace() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stu = context.getBean("student3",Student.class);
		System.out.println(stu.toString());
	}
	@org.junit.Test
	public void testInitAndDestory() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stu = context.getBean("student3",Student.class);
		System.out.println(stu.toString());
		context.close();
	}
	@org.junit.Test
	public void testBeforeAop() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService stuService = context.getBean("studentService",StudentService.class);
		stuService.save(null);
	
	}
	
}
