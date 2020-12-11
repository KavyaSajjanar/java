package com.xworkz.data;

import com.xworkz.data.dto.CompanyDTO;

public class CompanyDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyDTO dto=new CompanyDTO();
		System.out.println(dto.getName());
		

		CompanyDTO dto2=new CompanyDTO("TCS","banglore");
			System.out.println(dto2.getName());
			
			
			CompanyDTO dto3=new CompanyDTO("basavangudi","ratan",1995);
			System.out.println(dto3.getBranch());
			System.out.println(dto3.getCeoName());
			System.out.println(dto3.getStartedYear());
			

	}

}
