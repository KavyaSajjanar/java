package com.xworkz.constructors;

public class Garden {
	public String name;
	public int area;
	public float width;
	public int noOfTrees;

public Garden() {
	System.out.println("default value");
	
}
public Garden(String name) {
	System.out.println("invoking name");
	this.name=name;
	
}
public Garden(String name,int area) {
	System.out.println("invoking name and area");
	this.name=name;
	this.area=area;
}
public Garden(String name,int area,float width) {
	System.out.println("invoking name and area,width");
	this.name=name;
	this.area=area;
	this.width=width;
}
public Garden(int area,int noOfTrees) {
	System.out.println("invoking name and area,width");
	
	this.area=area;
	this.noOfTrees=noOfTrees;

}
}
