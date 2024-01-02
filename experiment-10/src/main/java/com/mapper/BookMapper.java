package com.mapper;

import java.util.List;

import com.bean.Book;

public interface BookMapper {
	List<Book> selectAll();
	Book selectById(int id);
	int insert(Book book);
	int update(Book book);
	int delete(int id);
	
}
