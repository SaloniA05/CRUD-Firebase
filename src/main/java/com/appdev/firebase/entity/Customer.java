package com.appdev.firebase.entity;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component 
public class Customer {
	
	private String id;
	private String name;
	private Map<String, Double> marks;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Double> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, Double> marks) {
		this.marks = marks;
	}
	
	
	
	
	
	
	

}
