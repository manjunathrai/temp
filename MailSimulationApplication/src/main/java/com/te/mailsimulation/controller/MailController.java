package com.te.mailsimulation.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.mailsimulation.bean.SecurityBean;
import com.te.mailsimulation.bean.SentMailBean;
import com.te.mailsimulation.bean.UserDetails;
import com.te.mailsimulation.service.MailService;

@Controller
public class MailController {
	@Autowired
	MailService service;

	@GetMapping("register")
	public String getregister() {
		return "register";
	}

	@PostMapping("register")
	public String registration(UserDetails user, SecurityBean security, String re_password) {
		boolean register = service.register(user, re_password, security);
//		boolean savesecure = service.savesecure(security);
		if (register)
			return "login";
		else
			return "register";
	}

	@GetMapping("login")
	public String getlogin() {
		return "login";
	}

	@PostMapping("login")
	public String login(String email, String password, HttpServletRequest req, ModelMap map) {
		UserDetails login = service.login(email, password);
		HttpSession session = req.getSession(false);
		if (login != null) {
			session.setAttribute("email", login.getEmail());
			session.setAttribute("pass", login.getPassword());
			session.setAttribute("username", login.getUsername());
			map.addAttribute("username", login.getUsername());
			List<SentMailBean> getinbox = service.getinbox(email,"sent");
			map.addAttribute("inbox",getinbox );
			return "Home";
		}
		return "login1";
	}
	
	@GetMapping("home")
	public String gethome(HttpServletRequest req, ModelMap map) {
		HttpSession session = req.getSession(false);
		map.addAttribute("username", session.getAttribute("username"));
		List<SentMailBean> getinbox = service.getinbox((String)session.getAttribute("email"),"sent");
		map.addAttribute("inbox",getinbox );
		return "Home";
	}

	@GetMapping("forgotpassword")
	public String getForgetPassword() {
		return "forgetpassword";
	}

	@PostMapping("forgetpassword")
	public String changePassword(SecurityBean security, HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.setAttribute("email", security.getEmail());
		boolean rs = service.forgotpass(security);
		if (rs) {
			session.setAttribute("email", security.getEmail());
			return "changepassword";
		} else
			return "changepassword1";
	}
 
	@PostMapping("forgotpasswords")
	public String changepass(UserDetails user, HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		user.setEmail((String) session.getAttribute("email"));
		boolean rs = service.changepass(user);
		if (rs)
			return "login";
		return "changepassword";

	}

	@GetMapping("newmail")
	public String newMail(ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		map.addAttribute("email", session.getAttribute("email"));
		return "newmail";
	}

	@PostMapping("send")
	public String sendmail(SentMailBean mail,ModelMap map,HttpServletRequest req) {
		System.out.println(mail);
		String mailstatus = service.sendmail(mail);
		System.out.println(mailstatus);
		 if(mailstatus.equalsIgnoreCase("Cancel")) {
			 HttpSession session = req.getSession(false);
				map.addAttribute("username", session.getAttribute("username"));
				List<SentMailBean> getinbox = service.getinbox((String)session.getAttribute("email"),"sent");
				map.addAttribute("inbox",getinbox );
				return "Home";
			}
		 else {
		if(!mailstatus.isEmpty()) {
		map.addAttribute("status",mailstatus);
		}
		
		else {
		map.addAttribute("status","Invalidmail");
		}}
		return "sentmail";
	}

	@GetMapping("draft")
	public String getDraft(HttpServletRequest req, ModelMap map) {
		HttpSession session = req.getSession(false);
		List<SentMailBean> getinbox = service.getSent((String)session.getAttribute("email"), "draft");
		map.addAttribute("username", session.getAttribute("username"));
		map.addAttribute("draft",getinbox );
		return "draft";
	}

	@GetMapping("sent")
	public String getSent(HttpServletRequest req, ModelMap map) {
		HttpSession session = req.getSession(false);
		List<SentMailBean> sent = service.getSent((String)session.getAttribute("email"), "sent");
		map.addAttribute("username", session.getAttribute("username"));
		map.addAttribute("sent",sent );
		return "sent";
	}
	
	@GetMapping("logout")
	public String logout(HttpServletRequest req,ModelMap map) {
		HttpSession session = req.getSession(false);
		map.addAttribute("username", session.getAttribute("username"));
		session.invalidate();
		return "logout";
	}
	
	@GetMapping("contact")
	public String getcontact() {
		return "contact";
	}

	@GetMapping("about")
	public String getabout() {
		return "about";
	}

	@GetMapping("welcome")
	public String firstPage() {
		return "welcome";
	}
}
