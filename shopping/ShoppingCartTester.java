package com.xworkz.shopping;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.shopping.cart.ShoppingCartDTO;

public class ShoppingCartTester {

	public static void main(String[] args) {
	ShoppingCartDTO dto1=new ShoppingCartDTO();
	dto1.setIteamName("salwar");
	dto1.setPrice(2000);
	dto1.setQuantity(1);
	
	ShoppingCartDTO dto2=new ShoppingCartDTO();
	dto2.setIteamName("bag");
	dto2.setPrice(4000);
	dto2.setQuantity(1);
	
	Collection<ShoppingCartDTO> cartDTOs=new ArrayList<ShoppingCartDTO>();
	cartDTOs.add(dto1);
	cartDTOs.add(dto2);
	
	ShoppingCartDTO dto3=new ShoppingCartDTO();
	dto3.setIteamName("bottle");
	dto3.setPrice(400);
	dto3.setQuantity(2);
	
	boolean contain=cartDTOs.contains(dto3);
	if(contain) {
		System.out.println("element is there.");
	}
	else {
		System.out.println("element is not there.");
		cartDTOs.add(dto3);
	}
	System.out.println(cartDTOs.size());
	

	}

}
