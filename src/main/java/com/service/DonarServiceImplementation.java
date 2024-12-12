package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DonarRepository;
import com.model.DonarForm;
@Service
public class DonarServiceImplementation implements DonarserviceInterface{

	@Autowired
	DonarRepository donarRepo;
	@Override
	public DonarForm saveDonarDetails(DonarForm donarform) {
		
		return donarRepo.save(donarform);
	}

}
