package com.xworkz.constructors;

public class Season {
	public String name;
	public String startMonth;
public Season() {
	System.out.println("default value");
}
public Season(String name,String startMonth) {
	System.out.println("invoking 2 parameter");
	this.name=name;
	this.startMonth=startMonth;
	
}
	
	
}


