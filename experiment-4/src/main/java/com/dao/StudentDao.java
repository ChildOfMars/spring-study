package com.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.bean.Student;

@Repository
public interface StudentDao {
	public int save(Student student);

	public int update();

	public int delete();

	public Student query();
	
	public List<Student> queryAll();
}
