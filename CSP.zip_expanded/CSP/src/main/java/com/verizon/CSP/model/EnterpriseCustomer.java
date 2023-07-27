package com.verizon.CSP.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EnterpriseCustomer {
	
	@Id
	@Column(name="EnterpriseCustomerId")
	private int encust_id;
	@Column(name="EnterpriseCustomerName")
	private String encust_name;
	private int order_id;
	
	public EnterpriseCustomer() {
		super();

	}
	
	public int getEncust_id() {
		return encust_id;
	}
	
	public void setEncust_id(int encust_id) {
		this.encust_id = encust_id;
	}
	
	public String getEncust_name() {
		return encust_name;
	}
	
	public void setEncust_name(String encust_name) {
		this.encust_name = encust_name;
	}
	
	public int getOrder_id() {
		return order_id;
	}
	
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	

}
