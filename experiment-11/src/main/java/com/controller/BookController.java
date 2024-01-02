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
			return "success";
		} else {
			request.setAttribute("msg", "添加失败");
			return "error";
		}
    }
	
	@RequestMapping("/queryBook/{id}")
	public String queryBook(@PathVariable int id, HttpServletRequest request) {
		Book book = bookService.findBookById(id);
		System.out.println(book);
		if (book != null) {
			request.setAttribute("book", book);
			return "success";
		} else {
			request.setAttribute("msg", "查询失败");
			return "error";
		}
	}
	
	@RequestMapping("/updateBook")
	public String updateBook(Book book, HttpServletRequest request) {
		boolean result = bookService.updateBook(book);
		if (result) {
			Book book2 = bookService.findBookById(book.getId());
			request.setAttribute("book", book2);
			return "success";
		} else {
			request.setAttribute("msg", "更新失败");
			return "error";
		}
	}
	
	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id, HttpServletRequest request) {
		boolean result = bookService.deleteBook(id);
		if (result) {
			request.setAttribute("msg", "删除成功");
			return "success";
		} else {
			request.setAttribute("msg", "删除失败");
			return "error";
		}
	}
	
	@RequestMapping(value="/testPageHelper/{page}",produces="application/json;charset=utf-8")
	@ResponseBody
	public PageInfo<Book> testPageHelper(@PathVariable int page, HttpServletRequest request) {
		PageInfo<Book> pageList = bookService.selectByPage(page);
		
		return pageList;
	}
	
	@RequestMapping(value="/findBook/{bookName}",produces="application/json;charset=utf-8")
	@ResponseBody
	public List<Book> findBook(@PathVariable String bookName, HttpServletRequest request) {
        List<Book> bookList = bookService.selectByBookName(bookName);
        
        return bookList;
    }
}
