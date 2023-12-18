package com.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Student;
import com.dao.StudentDao;

@Repository
public class StudentDaoImpl implements StudentDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int save(Student student) {
		int count = jdbcTemplate.update("insert into student values(null,?,?,?,?,?)",
				student.getSname(),student.getPassword(),student.getAge(),student.getMajor(),student.getStatus());
		System.out.println("dao执行insert");
		return count;
	}
	
}
