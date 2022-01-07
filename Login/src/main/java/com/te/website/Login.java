package com.te.website;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.te.website.Entity.UserDetails;

public class Login extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter writer = res.getWriter();
		String name = req.getParameter("uname");
		String password = req.getParameter("upass");
		String[] para = req.getParameterValues("Sports");
//		for(int i =0 ; i<para.length;i++)
//			writer.println(para[i]);
		EntityManager em = EntityObjectClass.getEntityManagerobj();
		EntityTransaction trans = em.getTransaction();
		String query = "select name from UserDetails where user_name=:un and password=:ps";
		trans.begin();
		Query createQuery = em.createQuery(query);
		createQuery.setParameter("un", name);
		createQuery.setParameter("ps", password);
		String singleResult;
		try {
			singleResult=  (String) createQuery.getSingleResult();
		}catch(Exception e)
		{
			singleResult = null;
		}
		trans.commit();
		if(singleResult==null)
		{
			writer.println("<body bgcolor= 'red'><h1>Invalid User_Name or Password</h1></body>");
		}
		else
		{
		writer.println("<body bgcolor='green'><h1>Hello "+singleResult+" Welcome to our Webseite</h1></body>");
		}
	}

}
