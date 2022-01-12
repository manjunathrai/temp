package com.te.springMvc.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Register
{
	private String name;
	private Long phone;
	@Id
	private String email;
	private String pass;
	private String re_pass;
	
}
