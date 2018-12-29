package com.altimetrik.microservice.react.bean;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {

	private ObjectId id;
	private String orderNumber;
	private String deliveryLocation;

	public Order() {
		super();
	}

	public Order(ObjectId id, String orderNumber, String deliveryLocation) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.deliveryLocation = deliveryLocation;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
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

}
