package com.accp.springmvc.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.mapper.StorageMapper;

@Service
public class StorageService {
	
	@Autowired
	private StorageMapper storageMapper;
	
	
	/**
	 * �޸Ĳֿ�����
	 */
	public int updateQty(int BookId) {
		return this.storageMapper.updateQty(BookId);
	}

	/**
	 * �޸Ĳֿ�����
	 */
	public int updateQtyj(int BookId) {
		return this.storageMapper.updateQtyj(BookId);
	}
}
