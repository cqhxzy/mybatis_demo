package com.hxzy.entity;

import java.io.Serializable;

public class OrdersDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4053519886632648803L;

	private Integer id;
	private Integer ordersId;
	private Integer itemId;
	private Integer itemNum;
	
	private Orders orders;
	private Item items;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(Integer ordersId) {
		this.ordersId = ordersId;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getItemNum() {
		return itemNum;
	}
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
	public Item getItems() {
		return items;
	}
	public void setItems(Item items) {
		this.items = items;
	}
	public OrdersDetail() {
		super();
	}
	public OrdersDetail(Integer id, Integer ordersId, Integer itemId, Integer itemNum, Orders orders, Item items) {
		super();
		this.id = id;
		this.ordersId = ordersId;
		this.itemId = itemId;
		this.itemNum = itemNum;
		this.orders = orders;
		this.items = items;
	}
	@Override
	public String toString() {
		return "OrdersDetail [id=" + id + ", ordersId=" + ordersId + ", itemId=" + itemId + ", itemNum=" + itemNum
				+ ", orders=" + orders + ", items=" + items + "]";
	}
	
}
