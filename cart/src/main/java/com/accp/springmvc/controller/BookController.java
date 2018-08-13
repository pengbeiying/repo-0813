package com.accp.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.springmvc.entity.Book;
import com.accp.springmvc.service.BookService;
import com.accp.springmvc.service.StorageService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;
	
//	@Autowired
//	private StorageService storageService;
	
	@RequestMapping(value="/selectAll")
	public String selectAll(Model model) {
		List<Book> book=this.bookService.selectAll();
		model.addAttribute("bookList", book);
		return "/WEB-INF/BookInfo/book.jsp";
	}
	
	
}
