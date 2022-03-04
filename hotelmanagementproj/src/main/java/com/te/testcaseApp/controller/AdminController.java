package com.te.testcaseApp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.resource.HttpResource;

import com.te.testcaseApp.dto.Employee;
import com.te.testcaseApp.dto.admin;
import com.te.testcaseApp.service.IService;

@Controller
@RequestMapping("/api/admin/")
public class AdminController {

	@Autowired
	private IService service;

	@GetMapping("login")
	public String getlogin(ModelMap map) {
		map.addAttribute("message", "Please provide credentials");
		return "adminlogin";
	}

	@PostMapping("login")
	public String login(String emailid, String password, ModelMap map, HttpServletRequest req) {
		admin validate = service.validate(emailid, password);
		HttpSession session = req.getSession();
		if (validate != null) {
			session.setAttribute("name", validate.getAdminname());
			map.addAttribute("name", validate.getAdminname());
			map.addAttribute("message", "This is Admin Home page");
			return "adminhome";
		} else {
			map.addAttribute("message", "Invalid Credentials");
			return "adminlogin";
		}
	}

	@GetMapping("add")
	public String getadd(ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();
		map.addAttribute("name", session.getAttribute("name"));
		return "addemployee";
	}

	@PostMapping("add")
	public String addemp(Employee employee, ModelMap map, HttpServletRequest req) {
		Employee add = service.add(employee);
		HttpSession session = req.getSession();
		if (add != null) {
			map.addAttribute("name", session.getAttribute("name"));
			map.addAttribute("message", "Details Added");
			return "adminhome";
		}
		return "fail";
	}

	@GetMapping("update")
	public String getupdate(ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();
		map.addAttribute("name", session.getAttribute("name"));
		return "updateemployee";
	}

	@PostMapping("update")
	public String update(Employee employee, ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();
		map.addAttribute("name", session.getAttribute("name"));
		String update = service.update(employee);
		map.addAttribute("message", update);
		return "adminhome";
	}

	@GetMapping("delete")
	public String getDelete(ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();
		map.addAttribute("name", session.getAttribute("name"));
		return "deleteemployee";
	}

	@PostMapping("delete")
	public String deleteEmployee(Employee employee, ModelMap map, HttpServletRequest req) {
		boolean delete = service.delete(employee.getEmpname());
		HttpSession session = req.getSession();
		map.addAttribute("name", session.getAttribute("name"));
		if (delete)
			map.addAttribute("message", "Record Deleted");
		else
			map.addAttribute("name", "No record found Please Check name");

		return "adminhome";

	}

	@GetMapping("get")
	public String getGetpage(ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();
		map.addAttribute("name", session.getAttribute("name"));
		return "getemployee";
	}

	@PostMapping("get")
	public String getEmployee(Employee employee, ModelMap map, HttpServletRequest req) {
		List<Employee> emp = new ArrayList<Employee>();
		HttpSession session = req.getSession();
		map.addAttribute("name", session.getAttribute("name"));
		if(employee.getEmpname().isEmpty()) {
			emp = service.getAllDetails();
		}
		else {
		Employee details = service.getDetails(employee.getEmpname());
		emp.add(details);
		if (details == null) {
			map.addAttribute("message", "No record found Please Check name");
			return "adminhome";
		}
		}
		map.addAttribute("data", emp);
		return "displayemployee";
	}
	
	@GetMapping("logout")
	public String logout(ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();
		map.addAttribute("name", session.getAttribute("name"));
		map.addAttribute("message", "Succesfully Logged Out");
		session.invalidate();
		return "logout";
	}
	
	@GetMapping("home")
	public String gethome(ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();
		map.addAttribute("name", session.getAttribute("name"));
		map.addAttribute("message", "This is Admin Home page");
		return "adminhome";
	}
}
