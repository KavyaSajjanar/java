package com.xworkz.constructors;

public class Fruit {
	public String name;
	public double price;
public Fruit() {
	System.out.println("default value");
}
	public Fruit(String name) {
		System.out.println("invoked by main");
		this.name=name;
	}

	public Fruit(String name,double price) {
		System.out.println("invoking 2 parameter");
		this.name=name;
		this.price=price;
	}
}
