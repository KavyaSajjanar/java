package com.xworkz.constructors;

public class SeasonTester {
	public static void main(String[] args) {
		Season season1=new Season(); 
			System.out.println(season1.name);
			
			Season season2=new Season("Summer","march");
			System.out.println("month is:" +season2.name);
			System.out.println("Start month is:" +season2.startMonth);
		}
	}


