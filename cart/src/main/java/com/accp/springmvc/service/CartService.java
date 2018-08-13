package com.accp.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Book;
import com.accp.springmvc.entity.Cart;
import com.accp.springmvc.mapper.CartMapper;

@Service
public class CartService {
	
	@Autowired
	private CartMapper cartMapper;
	
	/**
	 * �鿴���ﳵ
	 * @return
	 */
	public List<Cart> selectCart(){
		return this.cartMapper.selectCart();
	}

	/**
	 * ������Ʒ
	 */
	public int addBook(Book book) {
		return this.cartMapper.addBook(book);
	}
	
	/**
	 * ȡ������
	 */
	public int delBook(int cartid) {
		return this.cartMapper.delBook(cartid);
	}
	
	public int delAll() {
		return this.cartMapper.delAll();
	}
}
