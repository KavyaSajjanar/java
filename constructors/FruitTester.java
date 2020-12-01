package com.xworkz.constructors;

public class FruitTester {
	public static void main(String[] args) {
		Fruit fruit1=new Fruit();
		System.out.println(fruit1.name);
		
		Fruit fruit2=new Fruit("apple");
		System.out.println(fruit2.name);
		
		Fruit fruit3=new Fruit("mango",20);
		System.out.println(fruit3.name);
		
		System.out.println(fruit3.price);
	
		
		
	}

}
