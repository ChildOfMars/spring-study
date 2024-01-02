package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Book;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.BookMapper;
import com.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookMapper bookMapper;


	@Override
	public PageInfo<Book> selectByBookName(String bookName,int page) {
		PageHelper.startPage(page, 3);
		
		List<Book> bookList = bookMapper.selectByBookName(bookName);
		PageInfo<Book> pageInfo = new PageInfo<Book>(bookList);
		return pageInfo;
	}
	
	

}
