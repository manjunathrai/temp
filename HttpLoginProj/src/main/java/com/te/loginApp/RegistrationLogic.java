package com.te.loginApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.loginApp.EntityFolder.UserDetails;

public class RegistrationLogic extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//req.getAttribute("requ");
		PrintWriter writer = resp.getWriter();
		EntityManager em = EntityManagerClass.getEntityObject();
		EntityTransaction trans = em.getTransaction();
		
		String name = req.getParameter("name");
		String ph = req.getParameter("phone");
		long phone = Long.parseLong(ph);
		String uname = req.getParameter("uname");
		String password = req.getParameter("upass");
		String temp = req.getParameter("temp");
		if(!password.equalsIgnoreCase(temp))
			writer.println("<body bgcolor='red'><h1>Password not matching</h1><body>");
		else
		{
			UserDetails ud = new UserDetails();
			ud.setName(name);
			ud.setNumber(phone);
			ud.setUser_name(uname);
			ud.setPassword(password);
			trans.begin();
			em.persist(ud);
			trans.commit();
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("./login.html");
			requestDispatcher.forward(req, resp);
		}
			
		
	}

}
