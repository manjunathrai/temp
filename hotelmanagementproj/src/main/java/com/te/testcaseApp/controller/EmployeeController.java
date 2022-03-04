package com.te.testcaseApp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.te.testcaseApp.dto.Clientdetails;
import com.te.testcaseApp.dto.Employee;
import com.te.testcaseApp.dto.RoomDetails;
import com.te.testcaseApp.dto.RoomDetailsDisplay;
import com.te.testcaseApp.service.IService;

@Controller
@RequestMapping("/api/employee/")
public class EmployeeController {
	@Autowired
	IService service;

	@GetMapping("/login")
	public String getlogin(ModelMap map) {
		map.addAttribute("message", "Enter your credntial");
		return "employeelogin";
	}

	@PostMapping("login")
	public String login(Employee emp, ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();
		System.out.println(emp.getEmpmail() + " " + emp.getEmppassword());
		Employee employee = service.validateemployee(emp.getEmpmail(), emp.getEmppassword());
		if (employee != null) {
			session.setAttribute("name", employee.getEmpname());
			map.addAttribute("name", employee.getEmpname());
			map.addAttribute("message", "Employee home page");
			return "employeehome";
		}
		map.addAttribute("message", "Invalid credential");
		return "employeelogin";
	}

	@GetMapping("/book")
	public String getbooking(ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();
		map.addAttribute("name", session.getAttribute("name"));
		return "bookroom";
	}

	@PostMapping("/book")
	public String bookRoom(ModelMap map, HttpServletRequest req, RoomDetails room, Clientdetails client) {
		HttpSession session = req.getSession();
		room.setStatus("booked");
		Clientdetails bookRoom = service.bookRoom(client, room);
		map.addAttribute("name", session.getAttribute("name"));
		if (bookRoom != null) {
			map.addAttribute("message", "Room Booked successfully");
		} else {
			map.addAttribute("message", "Room Couldnot be booked !! Try Again");
		}
		return "employeehome";
	}

	@GetMapping("/checkout")
	public String getCheckOut(ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();
		map.addAttribute("name", session.getAttribute("name"));
		return "checkout";
	}
	
	@PostMapping("/checkout")
	public String checkOut(ModelMap map, HttpServletRequest req, RoomDetails room, Clientdetails client) {
		room.setStatus("empty");
		Clientdetails checkOut = service.checkOut(room,client.getPhonenumber());
		if(checkOut!=null) {
			String st = "";
			st+="Thank You "+checkOut.getClientname()+" Successfully Checked Out ";
			map.addAttribute("message", st);
		}else {
			map.addAttribute("message", "Room Couldnot be Checked out !! Try Again");
		}
		return "employeehome";
	}

	@GetMapping("available")
	public String getAvailable(ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();
		map.addAttribute("name", session.getAttribute("name"));
		List<RoomDetails> available = service.getAvailable();
		List<RoomDetailsDisplay> disp = new ArrayList<RoomDetailsDisplay>();
		for(int i=0;i<available.size();i++) {
			disp.add(new RoomDetailsDisplay(available.get(i).getRoomnum(), available.get(i).getFloor()));
		}
		map.addAttribute("detail", disp);
		return "roomavailable";
	}
	
	@GetMapping("home")
	public String getHome(ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();
		map.addAttribute("name", session.getAttribute("name"));
		map.addAttribute("message", "Employee home page");
		return "employeehome";
	}

	@GetMapping("logout")
	public String logout(ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();
		map.addAttribute("name", session.getAttribute("name"));
		map.addAttribute("message", "Succesfully Logged Out");
		session.invalidate();
		return "logout";
	}
		
	@GetMapping("get")
	public String getClientDetails(ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();
		map.addAttribute("name",session.getAttribute("name"));
		return "getclient";
	}
	
	@PostMapping("get")
	public String clientDetails(ModelMap map, HttpServletRequest req,Clientdetails client) {
		Clientdetails detail = service.getclient(client.getPhonenumber());
		HttpSession session = req.getSession();
		map.addAttribute("name",session.getAttribute("name"));
		map.addAttribute("detail", detail);
		return "clientdetail";
	}
}
