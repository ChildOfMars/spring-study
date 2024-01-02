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
	
	
	@RequestMapping(value="/findBook/{page}")
	public String findBook(String bookName,@PathVariable int page, HttpServletRequest request) {
		
		String search = (String)request.getSession().getAttribute("bookName");
		System.out.println(bookName);
		if (bookName == null) {
			bookName = search;
		}
		if (search == null && bookName == null) {
			return "search";
		}
		if (search != null && bookName.isEmpty()) {
			return "search";
		}
		PageInfo<Book> pageInfo = bookService.selectByBookName(bookName,page);
        request.setAttribute("bookList", pageInfo.getList());
        request.setAttribute("totalPage", pageInfo.getPages());
        request.setAttribute("currentPage", page);
        request.getSession().setAttribute("bookName", bookName);
        
        return "search";
    }
}
