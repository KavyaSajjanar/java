package com.xworkz.basics.pocket;

public class PocketMoneyEstimator {
	private static double totalAmount;
	public static void request(double amount,String day) {
		System.out.println("invoked request");
		System.out.println("arg1, amount:" +amount);
		System.out.println("arg2, day:" +day);
		totalAmount=totalAmount+amount;
		System.out.println("total amount after request" +totalAmount);
		System.out.println("Exit: request");
	}
		public static void Expenditure(double amount) {
			System.out.println("invoked expenditure");
			System.out.println("arg1, amount:" +amount);
			totalAmount=totalAmount-amount;
			System.out.println("total amount after expenditure" +totalAmount);
			System.out.println("exit: expenditure");
			
		}
		
		public static double getTotalAmount() 
		{
			return totalAmount;
		}
		
	}


