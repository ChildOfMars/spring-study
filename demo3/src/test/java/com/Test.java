package com;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class Test {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@org.junit.Test
	public void testInsert() {
		int count = jdbcTemplate.update("insert into book values(null,?,?,?)",
				"《MySQL实践教程》","张三",50.5);
		System.out.println("插入"+count+"条数据");
	}
	@org.junit.Test
	public void testUpdate() {
		int count = jdbcTemplate.update("update book set book_name=? where id=?",
				"《Java实践教程》",1);
		System.out.println("修改了"+count+"条数据");
	}
	@org.junit.Test
	public void testQueryAll() {
		List<Book> list = jdbcTemplate.query("select * from book", 
				new BeanPropertyRowMapper<Book>(Book.class));
		System.out.println(list);
	}
	@org.junit.Test
	public void testQueryOne() {
		Book book = jdbcTemplate.queryForObject("select * from book where id=?", 
				new BeanPropertyRowMapper<Book>(Book.class),3);
		System.out.println(book);
	}
//	@org.junit.Test
//	public void testQueryColumn() {
//		int count = jdbcTemplate.queryForObject("select count(*) from student", 
//				Integer.class);
//		System.out.println(count);
//	}
	@org.junit.Test
	public void testDelete() {
		int count = jdbcTemplate.update("delete from book where id=?",3);
		System.out.println("删除了"+count+"条数据");
	}
	
}
