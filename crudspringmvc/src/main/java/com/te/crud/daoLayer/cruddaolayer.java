package com.te.crud.daoLayer;

import java.util.List;

import com.te.crud.dto.Employee;

public interface cruddaolayer {
	public boolean add(Employee emp);

	public boolean delete(int id);

	public boolean update(int id,Employee emp);

	public Employee getDetails(int id);

	public List<Employee> getAllDetails();

}
