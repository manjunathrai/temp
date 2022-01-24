package com.te.mailsimulation.bean;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class SecurityBean extends MailCommonBean {
	@Column(name = "Email")
	private String email;
	@Column(name = "Security_Question")
	private String question;
	@Column(name = "Answer")
	private String answer;
	


}
