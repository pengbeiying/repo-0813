package com.accp.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.springmvc.entity.Book;
import com.accp.springmvc.entity.Cart;
import com.accp.springmvc.service.BookService;
import com.accp.springmvc.service.CartService;
import com.accp.springmvc.service.StorageService;

@Controller
@RequestMapping("/cartInfo")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@Autowired
	private StorageService storageService;
	
	@Autowired
	private BookService bookService;
	
	/**
	 * 查看购物车
	 * @return
	 */
	@RequestMapping(value="/selectCart")
	public String selectCart(Model model) {
		model.addAttribute("cartList", this.cartService.selectCart());
		return "/WEB-INF/BookInfo/cart.jsp";
	}
	
	/**
	 * 新增商品
	 */

	@RequestMapping(value="addBook",method=RequestMethod.GET)
	public String addBook(Book book,int bookid,float price) {
		book.setBookid(bookid);
		book.setPrice(price);
		this.storageService.updateQty(bookid);
		this.cartService.addBook(book);
		
		return "redirect:/cartInfo/selectCart.action";
	}
	
	@RequestMapping(value="delBook")
	public String delBook(int cartid,int bookid) {
		this.cartService.delBook(cartid);
		 this.storageService.updateQtyj(bookid);
		return "redirect:/cartInfo/selectCart.action";
	}
	
	@RequestMapping(value="delAll")
	public String delAll() {
		 this.cartService.delAll();
//		 this.storageService.updateQtyj(bookid);
		 return "redirect:/cartInfo/selectCart.action";
	}
}
