package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Book;
import com.github.pagehelper.PageInfo;
import com.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
	
	@PostMapping("/addBook")
    public String addBook(Book book, HttpServletRequest request) {
        boolean result = bookService.addBook(book);
		if (result) {
			Book book2 = bookService.findBookById(book.getId());
			request.setAttribute("book", book2);
			request.setAttribute("msg", "添加成功");
			return "success";
		} else {
			request.setAttribute("msg", "添加失败");
			return "error";
		}
    }
	
}
