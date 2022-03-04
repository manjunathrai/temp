package com.te.testcaseApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empid;
	@Column(name = "Employee_Name")
	private String empname;
	@Column(name = "Employee_Mail_Id")
	private String empmail;
	@Column(name = "Employee_Password")
	private String emppassword;
	@Column(name = "Employee_Phone_Number")
	private Long empnumber;
}
