package com.te.mailsimulation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.mailsimulation.bean.SecurityBean;

@Repository
public class MailDaoSecurityimpl implements MailDaoSecurity {
	
	public EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mailsimulation");
		return emf.createEntityManager();
	}

	@Override
	public SecurityBean saveSecurity(SecurityBean security) {
		try {
		EntityManager em = getEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		em.persist(security);
		trans.commit();
		return security;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public SecurityBean findBySecurity_QuestionAndAnswer(String question, String answer) {
		String query = "from SecurityBean where Security_Question=:que and Answer=:ans";
		try {
		EntityManager em = getEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		Query createQuery = em.createQuery(query);
		createQuery.setParameter("que", question);
		createQuery.setParameter("ans", answer);
		SecurityBean singleResult =(SecurityBean) createQuery.getSingleResult();
		trans.commit();
		return singleResult;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
