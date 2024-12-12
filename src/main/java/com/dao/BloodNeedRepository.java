package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.BloodNeed;

@Repository
public interface BloodNeedRepository  extends  JpaRepository<BloodNeed, Integer>{

}
