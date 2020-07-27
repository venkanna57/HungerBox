package com.dbtraining.hungerbox.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OrderDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderDetailId;
	
	@OneToOne
	@JoinColumn(name = "itemId")
	private Item item;
	
	private Integer itemquantity;
	
	@OneToOne
	@JoinColumn(name = "orderId")
	private Order order;
	

	public Integer getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(Integer orderDetailId) {
		this.orderDetailId = orderDetailId;
	}



	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Integer getItemquantity() {
		return itemquantity;
	}

	public void setItemquantity(Integer itemquantity) {
		this.itemquantity = itemquantity;
	}


	
	


}
