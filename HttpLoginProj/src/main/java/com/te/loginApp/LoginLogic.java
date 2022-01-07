package com.te.loginApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.loginApp.EntityFolder.UserDetails;

public class LoginLogic extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		String uname = req.getParameter("name");
		String password = req.getParameter("password");
		
		EntityManager em = EntityManagerClass.getEntityObject();
		EntityTransaction trans = em.getTransaction();
		String query = " from UserDetails where user_name=:un or password=:ps";
		trans.begin();
		Query createQuery = em.createQuery(query);
		createQuery.setParameter("un", uname);
		createQuery.setParameter("ps", password);
		UserDetails user1;
		try {
		 user1 = (UserDetails) createQuery.getSingleResult();
		}catch(Exception e)
		{
			user1 = null;
		}
		if(user1==null)
		{
			RequestDispatcher disp = req.getRequestDispatcher("./NotRegistered.html");
			disp.forward(req, resp);
		   
		}
		else if(user1.getUser_name().equals(uname) && user1.getPassword().equals(password))
		{
//			writer.println("<body bgcolor = 'green'>"
//					+ "<h1> Hello "+singleResult+" Welcome to our website"
//							+ "</h1></body>");
			resp.sendRedirect("https://youtube.com/");
		}
		else
		{
			RequestDispatcher disp = req.getRequestDispatcher("./invalid.jsp");
			disp.forward(req, resp);
		}
			
	}

}
