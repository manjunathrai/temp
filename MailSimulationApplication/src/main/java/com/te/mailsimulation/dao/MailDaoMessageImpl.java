package com.te.mailsimulation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.mailsimulation.bean.SentMailBean;

@Repository
public class MailDaoMessageImpl implements MailDaoMessage {

	public EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mailsimulation");
		return emf.createEntityManager();
	}

	@Override
	public SentMailBean save(SentMailBean mail) {
		try {
			EntityManager em = getEntityManager();
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			em.persist(mail);
			trans.commit();
			return mail;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<SentMailBean> getmail(String mail, String status) {
		String query = "from SentMailBean where to_id=:id and Status=:st";
		try {
			EntityManager em = getEntityManager();
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			Query createQuery = em.createQuery(query);
			createQuery.setParameter("id", mail);
			createQuery.setParameter("st", status);
			List<SentMailBean> resultList = createQuery.getResultList();
			return resultList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<SentMailBean> getSent(String email, String status) {
		String query = "from SentMailBean where From_id=:id and Status=:st";
		try {
			EntityManager em = getEntityManager();
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			Query createQuery = em.createQuery(query);
			createQuery.setParameter("id", email);
			createQuery.setParameter("st", status);
			List<SentMailBean> resultList = createQuery.getResultList();
			return resultList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
