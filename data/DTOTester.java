package com.xworkz.data;

import com.xworkz.data.dto.CustomerDTO;

public class DTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDTO customerDto=new CustomerDTO();
		customerDto.setCustomerId(567);
		System.out.println(customerDto.getCustomerId());
		customerDto.setName("kav");
		System.out.println(customerDto.getName());
		customerDto.setContactNo(9739899497l);
		System.out.println(customerDto.getContactNo());
		customerDto.setEmail("kavyasajjanar@gmail.com");
		System.out.println(customerDto.getEmail());
		
		
		
		CustomerDTO customerDto2=new CustomerDTO();
		customerDto2.setCustomerId(67);
		System.out.println(customerDto2.getCustomerId());
		customerDto2.setName("anu");
		System.out.println(customerDto2.getName());
		customerDto2.setContactNo(789654329l);
		System.out.println(customerDto2.getContactNo());
		customerDto2.setEmail("anu@gmail.com");
		System.out.println(customerDto2.getEmail());
		
	}
}
