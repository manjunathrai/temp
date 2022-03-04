package com.te.testcaseApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminid;
	private String adminname;
	private String adminemail;
	@Column(name = "Admin_Password")
	private String adminpassword;
}
