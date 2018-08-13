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
	 * 修改仓库数量
	 */
	public int updateQty(int BookId) {
		return this.storageMapper.updateQty(BookId);
	}

	/**
	 * 修改仓库数量
	 */
	public int updateQtyj(int BookId) {
		return this.storageMapper.updateQtyj(BookId);
	}
}
