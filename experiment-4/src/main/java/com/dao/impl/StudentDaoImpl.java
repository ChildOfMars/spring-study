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
	
	public int update() {
		int count = jdbcTemplate.update("update student set sname=? where sid=?", "金秋英", 2);
		System.out.println("dao执行update");
		return count;
	}
	
	public int delete() {
		int count = jdbcTemplate.update("delete from student where sid=?", 1);
		System.out.println("dao执行delete");
		return count;
	}
	
	public Student query() {
		Student student = jdbcTemplate.queryForObject("select * from student where sid=?",
				new BeanPropertyRowMapper<Student>(Student.class), 2);
		System.out.println("dao执行query");
		return student;
	}
	
	public List<Student> queryAll() {
		List<Student> list = jdbcTemplate.query("select * from student",
				new BeanPropertyRowMapper<Student>(Student.class));
		System.out.println("dao执行queryAll");
		return list;
	}
	
}
