//package com.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.model.DonarForm;
//import com.service.DonarserviceInterface;
//
//@RestController
//public class BloodDonarController {
//	
//	@Autowired
//	DonarserviceInterface donarservicei;
//	@PostMapping("saveDonar")
//	public DonarForm saveDonarForm(@RequestBody DonarForm donarform) {
//		return donarservicei.saveDonarDetails(donarform);
//	}
//
//}
