package com.xworkz.license.dao;

import com.xworkz.license.dto.LicenseDTO;

public class LicenseDAOImpl implements LicenseDAO {
	
	@Override
	public void save(LicenseDTO dto) {
		System.out.println("overriden save method");
		
	}
}
