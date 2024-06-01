package com.appdev.firebase.beans;

import java.util.List;

import org.springframework.stereotype.Component;

import com.appdev.firebase.entity.Customer;


@Component
public class CustomerListResponse {
	
	private List<Customer> list;

	public List<Customer> getList() {
		return list;
	}

	public void setList(List<Customer> list) {
		this.list = list;
	}
	
	

}
