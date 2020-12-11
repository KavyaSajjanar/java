package com.xworkz.data;
import java.util.Arrays;

import com.xworkz.data.dto.PlayerDTO;

public class PlayerTester {

	public static void main(String[] args) {
		
		String[] sport= {"cricket","Hockey","BasketBall"};
		String awards[]= {"Arjuna"};
		
		PlayerDTO playerDTO=new PlayerDTO();
		playerDTO.setName("Satnam singh");
		System.out.println(playerDTO.getName());
		playerDTO.setCountry("India");
		System.out.println(playerDTO.getCountry());
		
		playerDTO.setSports(sport);
	
		
		System.out.println(playerDTO.getSports());
		playerDTO.setAwards(awards);
		System.out.println(playerDTO.getAwards());

	}



	}


