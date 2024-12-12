package com.service;


import java.util.List;
import java.util.Optional;


import com.model.Userlogin;

public interface UserInfoService {

	
//	public Userlogin getUser(int userId);
	public Userlogin saveUser(Userlogin userInfo);
	public void deleteUser(int userId);
	public Userlogin getoneUser(int userInfo);
	public List<Userlogin> getAllUsers();
}
