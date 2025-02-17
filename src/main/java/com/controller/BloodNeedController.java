package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.BloodNeed;
import com.service.BloodNeedServiceInterface;

@RestController
public class BloodNeedController {

	
	@Autowired
	BloodNeedServiceInterface bloodneedservice;
	
	
	@PostMapping("saveBloodNeed")
	public BloodNeed saveBloodNeedForm(@RequestBody BloodNeed bloodneed) {
		return bloodneedservice.saveBloodNeedInfo(bloodneed);
	}
}
