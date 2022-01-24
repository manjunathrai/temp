package com.te.mailsimulation.service;

import java.util.List;

import com.te.mailsimulation.bean.SecurityBean;
import com.te.mailsimulation.bean.SentMailBean;
import com.te.mailsimulation.bean.UserDetails;

public interface MailService {

	public boolean register(UserDetails user, String repassword, SecurityBean security);

	public UserDetails login(String email, String password);

	public boolean forgotpass(SecurityBean security);

	public boolean changepass(UserDetails user);

	public String sendmail(SentMailBean mail);

	public List<SentMailBean> getinbox(String email, String status);

	public List<SentMailBean> getSent(String attribute, String string);
	
//	public boolean savesecure(SecurityBean security);

}
