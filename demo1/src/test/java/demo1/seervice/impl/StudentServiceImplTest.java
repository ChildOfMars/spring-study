package demo1.seervice.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo1.bean.Student;
import demo1.service.StudentService;

public class StudentServiceImplTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		StudentService bean = context.getBean("studentService",StudentService.class);
//		bean.registry(null);
		

		Student stu = context.getBean("student",Student.class);
		System.out.println(stu.toString());
		
		
	}

}
