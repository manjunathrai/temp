package com.te.mailsimulation.dao;

import com.te.mailsimulation.bean.SecurityBean;

public interface MailDaoSecurity {

	public SecurityBean saveSecurity(SecurityBean security);

	public SecurityBean findBySecurity_QuestionAndAnswer(String question, String answer);

}
