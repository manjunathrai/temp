package com.te.testcaseApp.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.testcaseApp.dto.admin;

@Repository
public class AdminDaoImpl implements AdminDao {
	
	public EntityManager getEntity() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin");
		return emf.createEntityManager();
	}

	@Override
	public admin validate(String emailid, String password) {
		try{
			EntityManager em = getEntity();
		EntityTransaction trans = em.getTransaction();
		System.out.println(emailid+" : "+password);
		String qry = "from admin where Admin_Email_Id=:em and Admin_Password=:ps";
		trans.begin();
		Query cq = em.createQuery(qry);
		cq.setParameter("em", emailid);
		cq.setParameter("ps", password);
		admin singleResult = (admin) cq.getSingleResult();
			return singleResult;
		}catch (Exception e) {
			return null;
		}
	}

}
