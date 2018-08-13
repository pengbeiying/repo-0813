package com.accp.springmvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc.entity.Book;
import com.accp.springmvc.entity.Cart;

public interface CartMapper {

	/**
	 * 查看购物车
	 * @return
	 */
	List<Cart> selectCart();
	
	/**
	 * 新增商品
	 */
	int addBook(Book book);
	
	/**
	 * 取消购买
	 */
	int delBook(@Param("cartid")int cartid);
	
	int delAll();
}
