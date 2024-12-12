package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.DonarForm;

@Repository
public interface DonarRepository extends JpaRepository<DonarForm, Integer>{

}
