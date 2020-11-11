package com.xworkz.basics.Credit;

public class CreditCardEstimate {

	
		// TODO Auto-generated method stub
		public static double totalAmount;
		public static void expenditure(double amount) {
	
				
		
			System.out.println("invoked request");
			System.out.println("arg1, amount:" +amount);
			
			totalAmount=totalAmount-amount;
			System.out.println("total amount after expenditure" +totalAmount);
			System.out.println("Exit: request");
		}
			public static void amount(double Amount) {
			  if (Amount<=1000) {
			  System.out.println("proceed");
			}
			   else {
				System.out.println("maximun expenditure is 1000");
			}
			}
}
			
			
		
	


