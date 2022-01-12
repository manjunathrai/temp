package com.te.crud.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.crud.dto.Employee;
import com.te.crud.service.crudservice;

@Controller
public class crudcontroller {

	@GetMapping("add")
	public String add() {
		return "insert";
	}

	@Autowired
	crudservice service;

	@PostMapping("add")
	public String insert(Employee emp) {
		if (service.add(emp))
			return "success";
		return "fail";
	}

	@GetMapping("delete")
	public String delete() {
		return "delete";
	}

	@PostMapping("delete")
	public String remove(@RequestParam("id") int id) {
		if (service.delete(id))
			return "success";
		return "fail";
	}

	@GetMapping("detail")
	public String Details() {
		return "detail";
	}

	@PostMapping("detail")
	public String search(@RequestParam("id") int id, ModelMap map) {
		Employee emp = service.getDetails(id);
		List<Employee> e = new ArrayList<Employee>();
		e.add(emp);
		if(emp==null)
			return "fail";
		map.addAttribute("employee",e);
		return "display";
	}
	
	@GetMapping("display")
	public String display(ModelMap map)
	{
		List<Employee> emp = service.getAllDetails();
		map.addAttribute("employee", emp);
		return "display";
	}
	
	@GetMapping("update")
	public String update()
	{
		return "update";
	}
	
	@PostMapping("update")
	public String Updatepg(@RequestParam("id") int id,ModelMap map,HttpServletResponse res)
	{
		Employee emp = service.getDetails(id);
		if(emp==null)
			return "fail";
		map.addAttribute("employee",emp);
		String i = "";
		i+=id;
		Cookie cookie = new Cookie("id", i);
		res.addCookie(cookie);
		return "updatedetails";
	}
	
	@PostMapping("over")
	public String reflect(@CookieValue String id,Employee emp)
	{
		int i = Integer.parseInt(id);
		if(service.update(i,emp))
			return "success";
		return "fail";
	}
}
