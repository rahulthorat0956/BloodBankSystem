package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserInfoRepository;
import com.model.Userlogin;

@Service
public class UserInfoServiceImplmentation implements UserInfoService{
	
	@Autowired
	UserInfoRepository userinforepo;

	@Override
	public List<Userlogin> getAllUsers() {
		// TODO Auto-generated method stub
		return userinforepo.findAll();
	}

	

	@Override
	public Userlogin saveUser(Userlogin userInfo) {
		// TODO Auto-generated method stub
		return userinforepo.save(userInfo);
	}

	@Override
	public void deleteUser(int userId) {
		userinforepo.deleteById(userId);
	}



	@Override
	public Userlogin getoneUser(int userInfo) {
		// TODO Auto-generated method stub
		return userinforepo.findById(userInfo).orElse(null);
	}



	
	

}
