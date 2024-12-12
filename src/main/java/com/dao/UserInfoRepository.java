package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Userlogin;

@Repository
public interface UserInfoRepository extends JpaRepository<Userlogin, Integer> {

	Userlogin findByUsermailAndUserpassword(String usermail, String userpassword);
}
