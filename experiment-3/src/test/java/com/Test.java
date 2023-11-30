package com;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class Test {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@org.junit.Test
	public void testInsert() {
		int count = jdbcTemplate.update("insert into student values(null,?,?,?,?,?)",
				"古冰","123456",20,"软件工程",1);
		System.out.println(count);
	}
	@org.junit.Test
	public void testUpdate() {
		int count = jdbcTemplate.update("update student set sname=? where sid=?",
				"金秋英",2);
		System.out.println(count);
	}
	@org.junit.Test
	public void testQueryAll() {
		List<Student> list = jdbcTemplate.query("select * from student", new BeanPropertyRowMapper<Student>(Student.class));
		System.out.println(list);
	}
	@org.junit.Test
	public void testQueryOne() {
		Student student = jdbcTemplate.queryForObject("select * from student where sid=?", 
				new BeanPropertyRowMapper<Student>(Student.class),2);
		System.out.println(student);
	}
	@org.junit.Test
	public void testQueryColumn() {
		int count = jdbcTemplate.queryForObject("select count(*) from student", 
				Integer.class);
		System.out.println(count);
	}
	@org.junit.Test
	public void testDelete() {
		int count = jdbcTemplate.update("delete from student where sid=?",1);
		System.out.println(count);
	}
	
}
