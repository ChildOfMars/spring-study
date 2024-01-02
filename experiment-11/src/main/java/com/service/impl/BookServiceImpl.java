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
	public boolean addBook(Book book) {
		int result = bookMapper.insertOne(book);
		if (result > 0) {
			return true;
		}
		return false;
	}

	@Override
	public Book findBookById(int id) {
		return bookMapper.selectById(id);
	}

	@Override
	public boolean updateBook(Book book) {
		int result = bookMapper.updateById(book);
		if (result > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteBook(int id) {
		int result = bookMapper.deleteById(id);
		if (result > 0) {
			return true;
		}
		return false;
	}

	@Override
	public PageInfo<Book> selectByPage(int page) {
		PageHelper.startPage(page, 5);
		List<Book> bookList = bookMapper.selectAll();
		return new PageInfo<>(bookList);
	}

	@Override
	public List<Book> selectByBookName(String bookName) {
		return bookMapper.selectByBookName(bookName);
	}
	
	

}
