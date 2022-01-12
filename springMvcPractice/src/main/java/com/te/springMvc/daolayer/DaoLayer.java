package com.te.springMvc.daolayer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.te.springMvc.model.Register;

@Component
public class DaoLayer {
	public boolean save(Register reg) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("webpage");

			EntityManager em = emf.createEntityManager();
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			em.persist(reg);
			trans.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
