package com;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bean.Book;
import com.mapper.BookMapper;

public class Test {

	@org.junit.Test
	public void testMybatisXml() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
//		Book selectOne = (Book)sqlSession.selectOne("com.mapper.BookMapper.selectAll");
//		System.out.println(selectOne);

//		List<Book> list = (List)sqlSession.selectList("com.mapper.BookMapper.selectAll");
//		System.out.println(list);

//		Map<String,Book> map = sqlSession.selectMap("com.mapper.BookMapper.selectAll", "id");
//		System.out.println(map);

		Book selectById = (Book) sqlSession.selectOne("com.mapper.BookMapper.selectById", 5);
		System.out.println(selectById);

//		Book book = new Book();
//		book.setId(7);
//		book.setBookName("Java");
//		book.setAuthor("James");
//		book.setPrice(100);
//		int count = sqlSession.insert("com.mapper.BookMapper.insert", book);
//		sqlSession.commit();
//		System.out.println(count);

//		Book book = new Book();
//		book.setId(7);
//		book.setBookName("《JavaWeb》");
//		int count = sqlSession.update("com.mapper.BookMapper.update", book);
//		sqlSession.commit();
//		System.out.println(count);

//		int count = sqlSession.delete("com.mapper.BookMapper.delete", 7);
//		sqlSession.commit();
//		System.out.println(count);
	}

	@org.junit.Test
	public void testMybatisInterface() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();

		BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
		List<Book> list = bookMapper.selectAll();
		System.out.println(list);
	}

}
