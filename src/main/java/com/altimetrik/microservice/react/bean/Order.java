package com.altimetrik.microservice.react.bean;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document
public class Order {

	@Id
	@JsonIgnore
	private ObjectId id;
	private int orderId;
	private String orderNumber;
	private String deliveryLocation;

	public Order() {
		super();
	}

	public Order(ObjectId id, int orderId, String orderNumber, String deliveryLocation) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.orderNumber = orderNumber;
		this.deliveryLocation = deliveryLocation;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getDeliveryLocation() {
		return deliveryLocation;
	}

	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderNumber=" + orderNumber + ", deliveryLocation=" + deliveryLocation
				+ "]";
	}

}
