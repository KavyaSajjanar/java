package com.xworkz.comp.computer;

public class DellLaptop extends LaptopComputer {
	private String color;
	
	
	public void charge() {
		System.out.println("invoked charge");
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

}
