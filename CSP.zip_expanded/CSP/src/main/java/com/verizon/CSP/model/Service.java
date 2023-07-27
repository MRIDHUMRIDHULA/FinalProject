package com.verizon.CSP.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Service {
	
	@Id
	private int plan_id;
	private int order_id;
	private String provision;
	@Column(name="QualityOfService")
	private String test_qos;
	private String activity;
	
	public Service() {
		super();
		
	}
	
	public int getPlan_id() {
		return plan_id;
	}
	
	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}
	
	public int getOrder_id() {
		return order_id;
	}
	
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	public String getProvision() {
		return provision;
	}
	
	public void setProvision(String provision) {
		this.provision = provision;
	}
	
	public String getTest_qos() {
		return test_qos;
	}
	
	public void setTest_qos(String test_qos) {
		this.test_qos = test_qos;
	}
	
	public String getActivity() {
		return activity;
	}
	
	public void setActivity(String activity) {
		this.activity = activity;
	}
	
}
