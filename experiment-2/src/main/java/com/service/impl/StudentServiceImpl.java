package com.service.impl;

import com.bean.Student;
import com.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Override
	public void save(Student stu) {
		System.out.println("StudentServiceImpl添加学生");
		
	}
	
}
