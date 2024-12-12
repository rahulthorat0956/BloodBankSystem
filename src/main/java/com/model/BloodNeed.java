package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BloodNeed {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int neederId;
	String needEmail;
	String needPhone;
	String needbloodType;
	
	public BloodNeed() {
		super();
	}
	
	public BloodNeed(int neederId, String needEmail, String needPhone, String needbloodType) {
		super();
		this.neederId = neederId;
		this.needEmail = needEmail;
		this.needPhone = needPhone;
		this.needbloodType = needbloodType;
	}
	
	public int getNeederId() {
		return neederId;
	}
	public void setNeederId(int neederId) {
		this.neederId = neederId;
	}
	public String getNeedEmail() {
		return needEmail;
	}
	public void setNeedEmail(String needEmail) {
		this.needEmail = needEmail;
	}
	public String getNeedPhone() {
		return needPhone;
	}
	public void setNeedPhone(String needPhone) {
		this.needPhone = needPhone;
	}
	public String getNeedbloodType() {
		return needbloodType;
	}
	public void setNeedbloodType(String needbloodType) {
		this.needbloodType = needbloodType;
	}
	
}
