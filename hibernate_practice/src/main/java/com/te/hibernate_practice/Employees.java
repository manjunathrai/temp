package com.te.hibernate_practice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Technoelevate")
public class Employees {
	@Id
	private int EmpId;
	private String Emp_Name;
	private String Designation;
	private long Sal;

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmp_Name() {
		return Emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public long getSal() {
		return Sal;
	}

	public void setSal(long sal) {
		Sal = sal;
	}

	@Override
	public String toString() {
		return "Employees [EmpId=" + EmpId + ", Emp_Name=" + Emp_Name + ", Designation=" + Designation + ", Sal=" + Sal
				+ "]";
	}

}
