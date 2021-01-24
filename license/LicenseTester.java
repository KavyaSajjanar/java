package com.xworkz.license;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dao.LicenseDAOImpl;
import com.xworkz.license.dto.AddressDTO;
import com.xworkz.license.dto.CommonDTO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AddressDTO dto=new AddressDTO("ani", "NA", 1234, "aniavi", "gadag", "KA", 582112);
		
		System.out.println(dto);
		
		
		Date date=new Date();
		CommonDTO commonDTO=new CommonDTO("nikki", 23, date, 987456780l, BloodGroup.O_POSITIVE, Gender.FEMALE);
		System.out.println(commonDTO);
		
		
		LicenseDTO licenseDTO=new LicenseDTO();
		licenseDTO.setIdProof(IdProof.ADHARCARD);
		licenseDTO.setIdProofNo("32452672882");
		licenseDTO.setType(VehicleType.TWO_WHEELER);
		licenseDTO.setDisability(false);
		licenseDTO.setCommercial(false);
		System.out.println(licenseDTO);
		
		LicenseDAO dao=new LicenseDAOImpl();
		dao.save(licenseDTO);
	}

}

