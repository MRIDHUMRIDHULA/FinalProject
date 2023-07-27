package com.verizon.CSP.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@Column(name="CustomerId")
	private int cust_id;
	@Column(name="CustomerName")
	private String cust_name;
	private int order_id;
	
	public Customer() {
		super();
	}
	
	public int getCust_id() {
		return cust_id;
	}
	
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	
	public String getCust_name() {
		return cust_name;
	}
	
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	
	public int getOrder_id() {
		return order_id;
	}
	
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	
	
	

}
