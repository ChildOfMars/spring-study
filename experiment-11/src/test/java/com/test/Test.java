package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bean.Book;
import com.mapper.BookMapper;

public class Test {
	@org.junit.Test
	public void testAnnotationCRUD() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
		
		// 查询所有
		List<Book> list = bookMapper.selectAll();	
		System.out.println(list);
		// 根据id查询
		Book selectById = bookMapper.selectById(5);
		System.out.println(selectById);
		// 添加
		Book book = new Book();
		book.setId(7);
		book.setBookName("Java");
		book.setAuthor("James");
		book.setPrice(100);
		int count = bookMapper.insertOne(book);
		sqlSession.commit();
		System.out.println("添加了"+count+"条记录");
		// 修改
		Book book2 = new Book();
		book2.setId(7);
		book2.setBookName("《JavaWeb》");
		book2.setAuthor("James");
		book2.setPrice(50);
		int count2 = bookMapper.updateById(book2);
		sqlSession.commit();
		System.out.println("修改了"+count2+"条记录");
		// 删除
		int count3 = bookMapper.deleteById(7);
		sqlSession.commit();
		System.out.println("删除了"+count3+"条记录");
		
	}
}
