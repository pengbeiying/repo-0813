package com.accp.springmvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc.entity.Book;

public interface BookMapper {
	
	/**
	 * ��ѯ����ͼ����Ϣ
	 * @return
	 */
	List<Book> selectAll();
	
	

}
