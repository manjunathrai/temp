package com.te.mailsimulation.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Table(name = "Mail_Info")
@EqualsAndHashCode(callSuper = false)
public class SentMailBean extends MailCommonBean {
	@Column(name = "From_id")
	private String fromemail;
	
	@Column(name = "To_id")
	private String toemail;
	
	@Column(name = "Subject")
	private String subject;
	
	@Column(name = "Message")
	private String message;
	
	@Column(name = "Status")
	private String status;
	
//	@ManyToMany
//	private List<UserDetails> user;
}
