package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Student;
import com.dao.StudentDao;
import com.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;
	
	public int addStudent(Student student) {
		int count = studentDao.save(student);
		System.out.println("service执行addStudent");
		return count;
	}
}
