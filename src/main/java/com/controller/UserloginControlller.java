//package com.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.model.Admin;
//import com.model.Userlogin;
//import com.service.Admininterface;
//import com.service.UserInfoService;
//
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//
//@RestController
//public class UserloginControlller {
//	
//	@Autowired
//	UserInfoService userinfoservice;
//	
//	@Autowired
//	Admininterface adminservice;
//	
//	@PostMapping("/save")
//	public Userlogin addUser(@RequestBody Userlogin user){
//		 return userinfoservice.saveUser(user);
//		
//	}
//	
//	
//	@PostMapping("/adminsave")
//	public Admin saveAdmin(@RequestBody Admin admin) {
//		return adminservice.saveAdmin(admin);
//	}
//	
//	@GetMapping("getuser/{userId}")
//	public Userlogin getUser(@PathVariable int userId) {
//		return userinfoservice.getoneUser(userId);
//	}
//	
//	@DeleteMapping("del/{userId}")
//	public void deleteuser(@PathVariable int  userId) {
//		userinfoservice.deleteUser(userId);
//	}
//	
//
//}
