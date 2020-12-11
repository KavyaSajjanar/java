package com.xworkz.data;

import com.xworkz.data.dto.MoblieDTO;

public class MobileDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoblieDTO dto=new MoblieDTO();
		System.out.println(dto.getMobileName());
		

		MoblieDTO dto2=new MoblieDTO("redmi","note7");
			System.out.println(dto2.getMobileName());
			System.out.println(dto2.getBrand());
			
	}
}
			