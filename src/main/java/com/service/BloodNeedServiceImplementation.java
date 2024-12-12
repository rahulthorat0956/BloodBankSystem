package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BloodNeedRepository;
import com.model.BloodNeed;
@Service
public class BloodNeedServiceImplementation implements BloodNeedServiceInterface {

	
	@Autowired
	BloodNeedRepository bloodneedRepo;
	@Override
	public BloodNeed saveBloodNeedInfo(BloodNeed bloodneed) {
		
		return bloodneedRepo.save(bloodneed);
	}

}
