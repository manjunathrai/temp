package com.te.mailsimulation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.mailsimulation.bean.SecurityBean;
import com.te.mailsimulation.bean.SentMailBean;
import com.te.mailsimulation.bean.UserDetails;
import com.te.mailsimulation.dao.MailDaoMessage;
import com.te.mailsimulation.dao.MailDaoSecurity;
//import com.te.mailsimulation.dao.MailDaoSecuritylayer;
import com.te.mailsimulation.dao.MailDaoUser;

@Service
public class MailServiceImpl implements MailService {
	@Autowired
	MailDaoUser detailslayer;
	@Autowired
	MailDaoSecurity securitylayer;
	@Autowired
	MailDaoMessage messagelayer;

	@Override
	public boolean register(UserDetails user, String repassword, SecurityBean security) {
		if (!user.getPassword().equals(repassword) || user == null) {
			return false;
		}
		UserDetails save = detailslayer.save(user);
		SecurityBean save2 = securitylayer.saveSecurity(security);
		if (save != null) {
			return true;
		}
		return false;
	}

	@Override
	public UserDetails login(String email, String password) {
		if (email.isEmpty() || password.isEmpty())
			return null;
		UserDetails byEmail = detailslayer.findByEmailAndPassword(email, password);
		if (byEmail != null)
			return byEmail;
		return null;
	}

	@Override
	public boolean forgotpass(SecurityBean security) {
		if (security == null)
			return false;
		SecurityBean securityBean = securitylayer.findBySecurity_QuestionAndAnswer(security.getQuestion(),
				security.getAnswer());
		if (securityBean == null || !(securityBean.getEmail().equals(security.getEmail())))
			return false;
		return true;
	}

	@Override
	public boolean changepass(UserDetails user) {
		UserDetails findByEmail = detailslayer.findByEmail(user.getEmail());
		if (findByEmail != null) {
			findByEmail.setPassword(user.getPassword());
			detailslayer.save(findByEmail);
			return true;
		}
		return false;
	}

	@Override
	public String sendmail(SentMailBean mail) {
		UserDetails findByEmail = detailslayer.findByEmail(mail.getFromemail());
		UserDetails findByEmail2 = detailslayer.findByEmail(mail.getToemail());
		if(mail.getStatus().equals("Cancel"))
			mail.setStatus("Draft");
		if(mail.getStatus().equals("Send"))
			mail.setStatus("Sent");
		if(findByEmail!=null&&findByEmail2!=null) {
			if(mail.getStatus().equals("Discard"))
				return "Cancel";
		if(mail!=null) {
			SentMailBean save = messagelayer.save(mail);
			return save.getStatus();
		}}
		return "";
	}

	@Override
	public List<SentMailBean> getinbox(String email, String status) {
		List<SentMailBean> getmail = messagelayer.getmail(email,status);
		return getmail;
	}

	@Override
	public List<SentMailBean> getSent(String email, String status) {
		List<SentMailBean> getsail = messagelayer.getSent(email,status);
		return getsail;
	}

	
}
