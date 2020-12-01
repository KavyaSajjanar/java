package com.xworkz.constructors;

public class Aquarium {
	public String material;
	public int price;
	public int capacity;
	public float size;
	
public Aquarium(String material,int price,int capacity,float size) {
	System.out.println("invoking many parameter");
	this.material=material;
	this.price=price;
	
	this.capacity=capacity;
	this.size=size;
	
	
	
}

}
