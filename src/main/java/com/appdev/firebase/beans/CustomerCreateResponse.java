package com.appdev.firebase.beans;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class CustomerCreateResponse {
	
	private String eid;
	private Date updatedTime;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public Date getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	
}
