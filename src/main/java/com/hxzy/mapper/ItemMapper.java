package com.hxzy.mapper;

import com.hxzy.entity.Item;

public interface ItemMapper extends CommonMapper<Item>{

	/**
	 * 根据itemId查询商品信息
	 * @param id
	 * @return
	 */
	public Item findItemById(Integer id);
}
