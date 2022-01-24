package com.te.mailsimulation.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Table(name = "User_info")
@EqualsAndHashCode(callSuper=false)
public class UserDetails extends MailCommonBean {

	
	@Column(name = "User_name", length = 255)
	private String username;
	@Column(name = "Email", length = 255,unique = true)
	private String email;
	@Column(name = "Password", length = 255)
	private String password;
	
//	@ManyToMany
//	private List<MailCommonBean> mail;

}
