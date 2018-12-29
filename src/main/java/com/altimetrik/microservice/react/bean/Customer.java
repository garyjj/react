package com.altimetrik.microservice.react.bean;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {

	private ObjectId id;
	private String customerName;
	private String customerAddress;

	public Customer() {
		super();
	}

	public Customer(ObjectId id, String customerName, String customerAddress) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

}
