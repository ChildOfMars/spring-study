package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.Book;
import com.github.pagehelper.PageInfo;


public interface BookService {
	boolean addBook(Book book);
	Book findBookById(int id);
	
}
