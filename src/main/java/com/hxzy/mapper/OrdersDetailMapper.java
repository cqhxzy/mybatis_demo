package com.hxzy.mapper;

import com.hxzy.entity.OrdersDetail;

public interface OrdersDetailMapper extends CommonMapper<OrdersDetail> {
	/**
	 * 根据订单明细编号查询订单明细
	 * @param id
	 * @return
	 */
	public OrdersDetail findDetailById(Integer id);
}
