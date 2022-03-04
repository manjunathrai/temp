package com.te.testcaseApp.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.testcaseApp.dto.RoomDetails;

public interface IRoomDao extends JpaRepository<RoomDetails, Integer>{
	
	public RoomDetails findRoomdetailsByRoomnum(Integer roomnum);
	public List<RoomDetails> findRoomdetailsByStatus(String status);

}
