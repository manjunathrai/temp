package com.te.springMvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.te.springMvc.daolayer.DaoLayer;
import com.te.springMvc.model.Register;

@Component
public class MvcService {
	@Autowired
	DaoLayer layer;

	public boolean save(Register reg) {
		if (reg == null) {
			return false;
		}
		boolean save = layer.save(reg);
		return save;
	}

}
