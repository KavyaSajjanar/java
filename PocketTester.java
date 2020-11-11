package com.xworkz.basics.pocket;

public class PocketTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoked by main");
		PocketMoneyEstimator.request(30,"Monday");
		PocketMoneyEstimator.request(40,"tue");
		PocketMoneyEstimator.Expenditure(50);
		
		PocketMoneyEstimator.Expenditure(30);
		System.out.println(PocketMoneyEstimator.getTotalAmount());
		System.out.println("exit main:");
		
	}

}
