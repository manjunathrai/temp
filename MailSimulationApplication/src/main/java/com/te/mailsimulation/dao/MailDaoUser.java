package com.te.mailsimulation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.mailsimulation.bean.UserDetails;

@Repository
public interface MailDaoUser extends JpaRepository<UserDetails, Integer> {

	public UserDetails findByEmailAndPassword(String email, String password);

	public UserDetails findByEmail(String email);

}
