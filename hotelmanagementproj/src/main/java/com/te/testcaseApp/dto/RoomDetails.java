package com.te.testcaseApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Room_Details")
public class RoomDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Room_id")
	private Integer id;
	@Column(name = "Room_Number")
	private Integer roomnum;
	@Column(name =  "Floor")
	private Integer floor;
	@Column(name = "Status")
	private String status;
}
