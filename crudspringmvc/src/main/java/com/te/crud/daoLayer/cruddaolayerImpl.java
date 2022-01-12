package com.te.crud.daoLayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.crud.dto.Employee;

@Repository
public class cruddaolayerImpl implements cruddaolayer {

	private EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		return emf.createEntityManager();
	}

	@Override
	public boolean add(Employee emp) {
		try {
			EntityManager em = getEntityManager();
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			em.persist(emp);
			trans.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(int id) {
		try {
			EntityManager em = getEntityManager();
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			Employee emp = em.getReference(Employee.class, id);
			System.out.println(emp);
			em.remove(emp);
			trans.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(int id, Employee emp) {
		try {
			EntityManager em = getEntityManager();
			EntityTransaction trans = em.getTransaction();
			String query = "update Employee set firstname=:fn,lastname=:ln,designation=:des,salary=:sl,doj=:date,email=:em where id=:i";
			String query1 = "update Employee set firstname=:fn where id=:i";
			String query2 = "update Employee set lastname=:ln where id=:i";
			String query3 = "update Employee set designation=:des where id=:i";
			String query4 = "update Employee set salary=:sl where id=:i";
			String query5 = "update Employee set doj=:date where id=:i";
			String query6 = "update Employee set email=:em where id=:i";
			trans.begin();
			Query createQuery = null;
			if (!(emp.getFirstname().isEmpty() || emp.getLastname().isEmpty() || emp.getDesignation().isEmpty()
					&& emp.getSalary() == null || emp.getDoj().isEmpty() || emp.getEmail().isEmpty())) {
				System.out.println("Update all");
				createQuery = em.createQuery(query);
				createQuery.setParameter("fn", emp.getFirstname());
				createQuery.setParameter("ln", emp.getLastname());
				createQuery.setParameter("des", emp.getDesignation());
				createQuery.setParameter("sl", emp.getSalary());
				createQuery.setParameter("date", emp.getDoj());
				createQuery.setParameter("em", emp.getEmail());
				createQuery.setParameter("i", id);
			} else if (!(emp.getFirstname().isEmpty()) && emp.getLastname().isEmpty() && emp.getDesignation().isEmpty()
					&& emp.getSalary() == null && emp.getDoj().isEmpty() && emp.getEmail() .isEmpty()) {
				System.out.println("Update name");
				createQuery = em.createQuery(query1);
				createQuery.setParameter("fn", emp.getFirstname());
				createQuery.setParameter("i", id);
			} else if (emp.getFirstname().isEmpty() && !(emp.getLastname().isEmpty()) && emp.getDesignation().isEmpty()
					&& emp.getSalary() == null && emp.getDoj().isEmpty() && emp.getEmail().isEmpty()) {
				System.out.println("Update lastname");
				createQuery = em.createQuery(query2);
				createQuery.setParameter("ln", emp.getLastname());
				createQuery.setParameter("i", id);
			} else if (emp.getFirstname().isEmpty() && emp.getLastname().isEmpty() && !(emp.getDesignation().isEmpty())
					&& emp.getSalary() == null && emp.getDoj().isEmpty()&& emp.getEmail().isEmpty()) {
				System.out.println("Update designation");
				createQuery = em.createQuery(query3);
				createQuery.setParameter("des", emp.getDesignation());
				createQuery.setParameter("i", id);
			} else if (emp.getFirstname().isEmpty()&& emp.getLastname().isEmpty()&& emp.getDesignation().isEmpty()
					&& emp.getSalary() != null && emp.getDoj().isEmpty() && emp.getEmail().isEmpty()) {
				System.out.println("Update salary");
				createQuery = em.createQuery(query4);
				createQuery.setParameter("sl", emp.getSalary());
				createQuery.setParameter("i", id);
			} else if (emp.getFirstname().isEmpty() && emp.getLastname().isEmpty() && emp.getDesignation().isEmpty()
					&& emp.getSalary() == null && !(emp.getDoj().isEmpty()) && emp.getEmail().isEmpty()) {
				System.out.println("Update doj");
				createQuery = em.createQuery(query5);
				createQuery.setParameter("date", emp.getDoj());
				createQuery.setParameter("i", id);
			} else if (emp.getFirstname().isEmpty() && emp.getLastname().isEmpty()&& emp.getDesignation().isEmpty()
					&& emp.getSalary() == null && emp.getDoj().isEmpty()&& !(emp.getEmail().isEmpty())) {
				System.out.println("Update email");
				createQuery = em.createQuery(query6);
				createQuery.setParameter("em", emp.getEmail());
				createQuery.setParameter("i", id);
			}
			createQuery.executeUpdate();
			trans.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Employee getDetails(int id) {
		EntityManager em = getEntityManager();
		EntityTransaction trans = em.getTransaction();
		String qry = "from Employee where id=:i";
		trans.begin();
		Query createQuery = em.createQuery(qry);
		createQuery.setParameter("i", id);
		Employee singleResult = (Employee) createQuery.getSingleResult();
		return singleResult;
	}

	@Override
	public List<Employee> getAllDetails() {
		EntityManager em = getEntityManager();
		EntityTransaction trans = em.getTransaction();
		String qry = "from Employee ";
		trans.begin();
		Query createQuery = em.createQuery(qry);
		List<Employee> resultList = createQuery.getResultList();
		return resultList;
	}
}
