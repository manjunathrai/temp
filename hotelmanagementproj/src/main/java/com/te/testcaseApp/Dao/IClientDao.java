package com.te.testcaseApp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.testcaseApp.dto.Clientdetails;
import com.te.testcaseApp.dto.RoomDetails;

public interface IClientDao extends JpaRepository<Clientdetails	, Integer> {
	
	public Clientdetails findClientdetailsByRoomAndPhonenumber(RoomDetails room,Long phonenumber);
	public Clientdetails findClientdetailsByPhonenumber(Long phonenumber);
	
}
