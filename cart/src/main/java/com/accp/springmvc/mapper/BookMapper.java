package com.accp.springmvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc.entity.Book;

public interface BookMapper {
	
	/**
	 * 查询所有图书信息
	 * @return
	 */
	List<Book> selectAll();
	
	

}
