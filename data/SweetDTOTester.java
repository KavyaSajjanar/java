package com.xworkz.data;

import java.util.Arrays;

import com.xworkz.data.dto.SweetDTO;

public class SweetDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			SweetDTO sweetDto=new SweetDTO("laddu", 200);
			System.out.println(sweetDto.getName());
			System.out.println(sweetDto.getPrice());
			sweetDto.setPrice(600);
			System.out.println("updated price  "+sweetDto.getPrice());
			
			String[] color=new String[3];
			color[0]="orange";
			color[1]="white";
			color[2]="yellow";
			
			SweetDTO sweetDto2=new SweetDTO("Karnataka","1KG",ShapeDTO.SQUARE, color);
			System.out.println(sweetDto2.getPopularState());
			System.out.println(sweetDto2.getQuantity());
			System.out.println(Arrays.toString(sweetDto2.getColor()));
			
			System.out.println(sweetDto2.getShape());
			sweetDto2.setShape(ShapeDTO.ROUND);
			System.out.println(sweetDto2.getShape());
			
			
			


	}

}
