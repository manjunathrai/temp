package com.te.springMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.springMvc.model.Register;
import com.te.springMvc.service.MvcService;

//@RequestMapping("/")
//@Component
@Controller
public class MvcController {

	@RequestMapping("/spider")
	public String home() {
		return "home";
	}

	@GetMapping("login")
	public String login() {
		return "login";
	}

//	public String log(HttpServletRequest req) 
//	{
//		String name = req.getParameter("user");
//		String pass = req.getParameter("pass");
//		if(name.isEmpty()||pass.isEmpty())
//			return "Fail.jsp";
//		return "Success.jsp";
//	}
	@RequestMapping(path = "login", method = RequestMethod.POST)
	public String log(@RequestParam("user") String name, @RequestParam("pass") String pass, ModelMap map) {

		if (name.isEmpty() || pass.isEmpty())
			return "Fail";
		map.addAttribute("name", name);
		return "Success";
	}

	@GetMapping("register")
	public String register() {
		return "Register";
	}

	@Autowired
	MvcService service;

	@PostMapping("register")
	public String registration(@ModelAttribute Register reg, ModelMap map) {
		map.addAttribute("details", reg);
		boolean save = service.save(reg);
		if (save)
			return "Success";
		else
			return "Fail";
	}
}
