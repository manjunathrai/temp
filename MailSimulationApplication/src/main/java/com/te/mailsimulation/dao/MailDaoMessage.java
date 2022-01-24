package com.te.mailsimulation.dao;

import java.util.List;

import com.te.mailsimulation.bean.SentMailBean;

public interface MailDaoMessage {
	
	public SentMailBean save(SentMailBean mail);
	
	public List<SentMailBean> getmail(String mail, String status);

	public List<SentMailBean> getSent(String email, String status);

}
