package demo1.dao.impl;

import demo1.bean.Student;
import demo1.dao.StudentDao;

public class StudentDaoImpl implements StudentDao{

	
	
	public StudentDaoImpl() {
		System.out.println("StudentDaoImpl的构造方法执行了");
	}

	@Override
	public void addStudent(Student student) {
		System.out.println("StudentImplDao的add方法执行了");
		
	}

}
