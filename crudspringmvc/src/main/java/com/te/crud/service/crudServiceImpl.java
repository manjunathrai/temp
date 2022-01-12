package com.te.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.crud.daoLayer.cruddaolayer;
import com.te.crud.dto.Employee;

@Service
public class crudServiceImpl implements crudservice {
	@Autowired
	cruddaolayer layer;

	@Override
	public boolean add(Employee emp) {
		if (emp == null)
			return false;
		return layer.add(emp);
	}

	@Override
	public boolean delete(int id) {
		if (id == 0)
			return false;
		return layer.delete(id);
	}

	@Override
	public boolean update(int id,Employee emp) {
		System.out.println(emp);
		if(emp==null)
			return false;
		return layer.update(id,emp);
	}

	@Override
	public Employee getDetails(int id) {
		if (id == 0)
			return null;
		return layer.getDetails(id);
	}

	@Override
	public List<Employee> getAllDetails() {
		return layer.getAllDetails();
	}

}
