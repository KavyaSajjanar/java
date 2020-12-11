package com.xworkz.data;

import java.util.Date;

import com.xworkz.data.dto.FileDTO;

public class FileDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileDTO dto=new FileDTO();
System.out.println(dto.getName());
System.out.println(dto.getCreatedDate());

FileDTO dto2=new FileDTO("abc",200);
	System.out.println(dto2.getName());
	System.out.println(dto2.getSize());
	System.out.println(dto2.getCreatedDate());
	Date CurrentDate=new Date();
	dto2.setCreatedDate(CurrentDate);
	System.out.println(dto2.getCreatedDate());
	dto.setLocation("c:");
	dto.setType("img");
	Date date=new Date();
	
	FileDTO dto3=new FileDTO();
	System.out.println(dto3.getName());
	System.out.println(dto3.getSize());
	System.out.println(dto3.getType());
	System.out.println(dto3.getLocation());
	System.out.println(dto3.getCreatedDate());

	
	}

	


	}
	

