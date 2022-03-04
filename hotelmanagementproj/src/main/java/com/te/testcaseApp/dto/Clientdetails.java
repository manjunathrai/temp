package com.te.testcaseApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Clientdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Client_Id")
	private Integer id;
	@Column(name = "Client_name")
	private String clientname;
	@Column(name = "Client_Email")
	private String clientemail;
	@Column(name = "Client_Password")
	private String clientpass;
	@Column(name = "Client_Government_Id")
	private String clientgovid;
	@Column(name = "Client_Phone_number")
	private Long phonenumber;
	@OneToOne()
	private RoomDetails room;
	
	
}
