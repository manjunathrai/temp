package com.te.testcaseApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.testcaseApp.Dao.AdminDao;
import com.te.testcaseApp.Dao.IClientDao;
import com.te.testcaseApp.Dao.IEmployeeDao;
import com.te.testcaseApp.Dao.IRoomDao;
import com.te.testcaseApp.dto.Clientdetails;
import com.te.testcaseApp.dto.Employee;
import com.te.testcaseApp.dto.RoomDetails;
import com.te.testcaseApp.dto.admin;

@Service
public class AdminServiceImpl implements IService {

	@Autowired
	AdminDao admindao;
	@Autowired
	IEmployeeDao employeedao;
	@Autowired
	IClientDao clientdao;
	@Autowired
	IRoomDao roomdao;

	@Override
	public admin validate(String emailid, String password) {
		admin validate = admindao.validate(emailid, password);
		if(validate.getAdminemail().equals(emailid)&&validate.getAdminpassword().equals(password))
		return validate;
		else
			return null;

	}

	@Override
	public Employee add(Employee employee) {
		Employee save = employeedao.save(employee);
		return save;

	}

	@Override
	public boolean delete(String name) {
		Employee ename = employeedao.findEmployeeByEmpname(name);
		if (ename != null) {
			employeedao.delete(ename);
			return true;
		}
		return false;
	}

	@Override
	public String update(Employee employee) {
		Employee ename = employeedao.findEmployeeByEmpname(employee.getEmpname());
		if (ename != null) {
			if (!employee.getEmpmail().isEmpty())
				ename.setEmpmail(employee.getEmpmail());
			if (employee.getEmpnumber() != null)
				ename.setEmpnumber(employee.getEmpnumber());
			if (!employee.getEmppassword().isEmpty())
				ename.setEmppassword(employee.getEmppassword());
			employeedao.save(ename);
			return "Updated Successfully";
		}
		return "No data Found To Update!! Check name Properly";

	}

	@Override
	public Employee getDetails(String name) {
		Employee empname = employeedao.findEmployeeByEmpname(name);
		return empname;
	}

	@Override
	public List<Employee> getAllDetails() {
		List<Employee> findAll = employeedao.findAll();
		return findAll;
	}

	@Override
	public Employee validateemployee(String empmail, String emppassword) {
		Employee emp = employeedao.findEmployeeByEmpmail(empmail);
		System.out.println(emp);
		if (emp != null) {
			if (emp.getEmppassword().equals(emppassword))
				return emp;
		}

		return null;
	}

	@Override
	public Clientdetails bookRoom(Clientdetails client, RoomDetails room) {
		try {
			Clientdetails save = null;
			if (client != null && room != null) {
				RoomDetails roomdetails = roomdao.findRoomdetailsByRoomnum(room.getRoomnum());
				if (roomdetails != null) {
					if (roomdetails.getStatus().equals("booked")) {
						return null;
					}
					roomdetails.setRoomnum(room.getRoomnum());
					roomdetails.setStatus(room.getStatus());
				}
				client.setRoom(roomdetails);
				save = clientdao.save(client);
				roomdao.save(roomdetails);
			}
			return save;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Clientdetails checkOut(RoomDetails room,Long number) {
		Clientdetails client = null;
		try {
			if (room != null) {
				RoomDetails roomdetails = roomdao.findRoomdetailsByRoomnum(room.getRoomnum());
				System.out.println(roomdetails+" , "+number);
				if (roomdetails != null) {
					roomdetails.setStatus(room.getStatus());
					client = clientdao.findClientdetailsByRoomAndPhonenumber(roomdetails,number);
					roomdao.save(roomdetails);
				}
			}
			return client;
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public List<RoomDetails> getAvailable() {
		List<RoomDetails> rooms = roomdao.findRoomdetailsByStatus("empty");
		return rooms;
	}

	@Override
	public Clientdetails getclient(Long phonenumber) {
		Clientdetails client=null;
		if(phonenumber!=null) {
			 client = clientdao.findClientdetailsByPhonenumber(phonenumber);
		}
		return client;
	}

}
