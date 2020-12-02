package com.xworkz.copies.init;

public class Paper {
	private String brand;
	private int width;
	private float height;
	private String color;
	public Paper(String brand,int width,float height,String color) {
		this.brand=brand;
		this.width=width;
		this.height=height;
		this.color=color;
		
		}
	public String getBrand() {
		return brand;
	}
	public int getWidth() {
		return width;
	}
	public float getHeight() {
		return height;
	}
	public String getColor() {
		return color;
	}

}
