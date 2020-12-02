package com.xworkz.copies;

import com.xworkz.copies.init.Paper;
import com.xworkz.copies.init.Temple;

public class PaperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paper paper=new Paper("Classmate",90,8.0f,"white");
		String brand=paper.getBrand();
		int width=paper.getWidth();
		float height=paper.getHeight();
		String color=paper.getColor();
		
		System.out.println(brand);
		System.out.println(width);
		System.out.println(height);
		System.out.println(color);
		


	}

}
