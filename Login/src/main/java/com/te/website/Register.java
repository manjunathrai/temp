package com.te.website;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.mysql.cj.PerConnectionLRUFactory;
import com.te.website.Entity.UserDetails;

public class Register extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String ph = req.getParameter("phone");
		long phone = Long.parseLong(ph);
		String uname = req.getParameter("uname");
		String password = req.getParameter("upass");
		UserDetails ud = new UserDetails();
		ud.setName(name);
		ud.setNumber(phone);
		ud.setUser_name(uname);
		ud.setPassword(password);
		
	   EntityManager em = EntityObjectClass.getEntityManagerobj();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		em.persist(ud);
		trans.commit();
		PrintWriter writer = res.getWriter();
		writer.println("<h1>"+name+" Register sucessfully </h1>");
		
	}
	

}
