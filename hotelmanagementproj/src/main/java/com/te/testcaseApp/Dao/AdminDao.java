package com.te.testcaseApp.Dao;

import com.te.testcaseApp.dto.admin;

public interface AdminDao {
	public admin validate(String emailid, String password);

}
