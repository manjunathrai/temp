package com.te.testcaseApp.service;

import java.util.List;

import com.te.testcaseApp.dto.Clientdetails;
import com.te.testcaseApp.dto.Employee;
import com.te.testcaseApp.dto.RoomDetails;
import com.te.testcaseApp.dto.admin;

public interface IService {
	public admin validate(String emailid, String password);
	public Employee add(Employee employee);
	public boolean delete(String name);
	public String update(Employee employee);
	public Employee getDetails(String name);
	public List<Employee> getAllDetails();
	public Employee validateemployee(String empmail, String emppassword);
	public Clientdetails bookRoom(Clientdetails client,RoomDetails room);
	public Clientdetails checkOut(RoomDetails room,Long number);
	public List<RoomDetails> getAvailable();
	public Clientdetails getclient(Long phonenumber);
}
