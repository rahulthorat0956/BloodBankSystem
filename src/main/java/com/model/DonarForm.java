package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DonarForm {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int donarId;
	String donarEmail;
	String phoneNo;
	String boodType;
	public DonarForm() {
		super();
	}
	public DonarForm(int donarId, String donarEmail, String phoneNo, String boodType) {
		super();
		this.donarId = donarId;
		this.donarEmail = donarEmail;
		this.phoneNo = phoneNo;
		this.boodType = boodType;
	}
	public int getDonarId() {
		return donarId;
	}
	public void setDonarId(int donarId) {
		this.donarId = donarId;
	}
	public String getDonarEmail() {
		return donarEmail;
	}
	public void setDonarEmail(String donarEmail) {
		this.donarEmail = donarEmail;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getBoodType() {
		return boodType;
	}
	public void setBoodType(String boodType) {
		this.boodType = boodType;
	}
	
	
}
