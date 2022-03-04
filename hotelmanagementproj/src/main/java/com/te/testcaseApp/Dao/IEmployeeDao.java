package com.te.testcaseApp.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.testcaseApp.dto.Employee;

public interface IEmployeeDao extends JpaRepository<Employee, Integer> {
	
	public Employee findEmployeeByEmpname(String empname);
	public Employee findEmployeeByEmpmail(String empmail);
	

}
