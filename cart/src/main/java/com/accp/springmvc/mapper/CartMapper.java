package com.accp.springmvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc.entity.Book;
import com.accp.springmvc.entity.Cart;

public interface CartMapper {

	/**
	 * �鿴���ﳵ
	 * @return
	 */
	List<Cart> selectCart();
	
	/**
	 * ������Ʒ
	 */
	int addBook(Book book);
	
	/**
	 * ȡ������
	 */
	int delBook(@Param("cartid")int cartid);
	
	int delAll();
}
