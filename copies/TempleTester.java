package com.xworkz.copies;

import com.xworkz.copies.init.Temple;

public class TempleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Temple temple=new Temple("saibaba","hubli",6.0f,"payasa",7.0f);
String name=temple.getName();
String location=temple.getLocation();
String prasada=temple.getPrasada();
System.out.println(name);
System.out.println(location);
System.out.println(prasada);

	}

}
