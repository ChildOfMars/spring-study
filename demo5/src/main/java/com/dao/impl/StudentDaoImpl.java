package com.dao.impl;

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

	@Override
	public void updateSumScore(int id,float sumScore) {
		
		jdbcTemplate.update("update student set sum_score=? where id=?", sumScore, id);
		
	}

	@Override
	public Student queryStudentById(int id) {
		Student student = jdbcTemplate.queryForObject("select * from student where id=?", 
				new BeanPropertyRowMapper<Student>(Student.class), 
				id);
		return student;
	}

}
