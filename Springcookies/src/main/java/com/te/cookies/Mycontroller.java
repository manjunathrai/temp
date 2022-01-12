package com.te.cookies;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Mycontroller {
	//Cookies//
//	@GetMapping("login")
//	public String getLogin() {
//		return "login";
//	}
//	
//	@PostMapping("login")
//	public String login(String user,String pass,ModelMap map,HttpServletResponse res) {
//		Cookie c1=new Cookie("name", user);
//		Cookie c2 = new Cookie("password", pass);
//		res.addCookie(c1);
//		res.addCookie(c2);
//		map.addAttribute("name", user);
//		return "welcome";
//	}
//	
//	@GetMapping("inbox")
//	public String inbox(HttpServletRequest req, ModelMap map) {
//		Cookie c[]=req.getCookies();
//		map.addAttribute("name",c);
//		return "inbox";
//	}
	
	//Session//
	
	@GetMapping("login")
	
	public String getLogin() {
		return "login";
	}
	
	@PostMapping("login")
	public String login(String user,String pass,ModelMap map,HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.setAttribute("name", user);
		session.setAttribute("pass", pass);
		map.addAttribute("name",user);
		return "welcome";
	}
	
	@GetMapping("inbox")
	public String inbox(HttpServletRequest req, ModelMap map) {
		HttpSession session = req.getSession(true);
		map.addAttribute("name",session.getAttribute("name"));
		map.addAttribute("pass",session.getAttribute("pass"));
		return "inbox";
	}
}
