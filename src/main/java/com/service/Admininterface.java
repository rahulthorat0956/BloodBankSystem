package com.service;

import java.util.List;

import com.model.Admin;
import com.model.DonarForm;
import com.model.Userlogin;

public interface Admininterface {

	public Admin saveAdmin(Admin admin);
	
	public List<Userlogin> userData();
	public List<DonarForm> donarData();

}
