package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dao.AdminRepository;
import com.dao.DonarRepository;
import com.dao.UserInfoRepository;
import com.model.Admin;
import com.model.DonarForm;
import com.model.Userlogin;
import com.service.Admininterface;
import com.service.UserInfoService;



@Controller
public class TemplateController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/index.html")
	public String homeredirect() {
		return "index";
	}
	
	@GetMapping("/header.html")
	public String header() {
		return "header";
	}
	
	@GetMapping("/login.html")
	public String login(Model model) {
		model.addAttribute("Userlogin", new Userlogin());
		
		return "login";
	}
	
	@Autowired
	UserInfoRepository userRepo;
	
	@PostMapping("/login")
	public String userLogin(@ModelAttribute Userlogin userLogin, Model model) {
		Userlogin user= userRepo.findByUsermailAndUserpassword(userLogin.getUsermail(), userLogin.getUserpassword());
		
		if(user != null )
		{
			return "redirect:/DonarHomePage.html";
		}else {
			model.addAttribute("error","invalid Email and Password");
			return "login.html";
		}
	}
	
	@GetMapping("/Register.html")
	public String register(Model model) {
		
		  model.addAttribute("Userlogin", new Userlogin());

		return "Register";
	}
	

	@Autowired
	UserInfoService userinfoservice;
	
	@PostMapping("/register")
	   public String saveUserData(Userlogin user) {
	        // Save data to the database
		userinfoservice.saveUser(user);
		return "redirect:/login.html";
	    }
	

	 
	
	@GetMapping("/DonarHomePage.html")
	public String donarpage() {
		return "DonarHomePage";
	}
	
	@GetMapping("/DonarForm.html")
	public String donarform(Model model) {
		
		model.addAttribute("DonarForm",new DonarForm());
		
		return "DonarForm";
	}

	@Autowired
	DonarRepository donarRepo;
	
	@PostMapping("/saveDonar")
	public String saveDonarForm(DonarForm donar)
	{
		donarRepo.save(donar);
		return "redirect:/DonarHomePage.html";
	}
	
	@GetMapping("/contact.html")
	public String contact() {
		return "contact";
	}
	
	@GetMapping("/Admin.html")
	public String admin(Model model) {
		
		model.addAttribute("Admin",new Admin());
		
		return "Admin";
				
	}
	
	@Autowired
	Admininterface adminServ;
	
	@GetMapping("/AdminData.html")
	public String getAllAdmin(Model model) {
		
		List<Userlogin> userData = adminServ.userData();
		List<DonarForm> donarData = adminServ.donarData();
		
		model.addAttribute("userData",userData);
		model.addAttribute("donarData",donarData);
		
		
		return "AdminData";
	}
	
	
	
	
	@Autowired
	AdminRepository adminRepo;
	
	@PostMapping("/admin")
	public String adminlogin(Model model,@ModelAttribute Admin admin) {
		Admin adminlogin = adminRepo.findByAdminemailAndAdminpassword(admin.getAdminemail(), admin.getAdminpassword());
		
		if(adminlogin != null)
		{
			return "redirect:/AdminData.html";
		}
		else {
			model.addAttribute("error","invalid Email and Password");
			return "Admin.html";
		}
		
	}
	
	@GetMapping("/about.html")
	public String about() {
		return "about";
	}
	
	
}
