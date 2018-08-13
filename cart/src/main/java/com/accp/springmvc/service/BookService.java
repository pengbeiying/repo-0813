package com.accp.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Book;
import com.accp.springmvc.mapper.BookMapper;

@Service
public class BookService {

	@Autowired
	private BookMapper bookMapper;
	

	/**
	 * ��ѯ����ͼ����Ϣ
	 * @return
	 */
	public List<Book> selectAll(){
		return this.bookMapper.selectAll();
	}
	
	
}
