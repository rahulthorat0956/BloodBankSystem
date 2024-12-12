package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminRepository;
import com.dao.DonarRepository;
import com.dao.UserInfoRepository;
import com.model.Admin;
import com.model.DonarForm;
import com.model.Userlogin;

@Service
public class AdmininterfaceImplementation implements Admininterface{

	
	@Autowired
	AdminRepository admminrepository;
	
	@Autowired
	UserInfoRepository userRepo;

	@Autowired
	DonarRepository donarRepo;
	
	
	@Override
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return admminrepository.save(admin);
	}
	@Override
	public List<Userlogin> userData() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	@Override
	public List<DonarForm> donarData() {
		// TODO Auto-generated method stub
		return donarRepo.findAll();
	}

}
