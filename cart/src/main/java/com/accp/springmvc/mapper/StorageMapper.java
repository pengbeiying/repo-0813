package com.accp.springmvc.mapper;

import org.apache.ibatis.annotations.Param;

public interface StorageMapper {
	
	
	/**
	 * 修改仓库数量
	 */
	int updateQty(@Param("BookId")int BookId);
	
	/**
	 * 修改仓库数量
	 */
	int updateQtyj(@Param("BookId")int BookId);

}
