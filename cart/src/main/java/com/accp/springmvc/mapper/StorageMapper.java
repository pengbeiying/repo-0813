package com.accp.springmvc.mapper;

import org.apache.ibatis.annotations.Param;

public interface StorageMapper {
	
	
	/**
	 * �޸Ĳֿ�����
	 */
	int updateQty(@Param("BookId")int BookId);
	
	/**
	 * �޸Ĳֿ�����
	 */
	int updateQtyj(@Param("BookId")int BookId);

}
