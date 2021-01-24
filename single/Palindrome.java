package com.xworkz.single;

public class Palindrome {
	public static void main(String[] args) {
		int num = 24;
		int reverse = 0; 
		int remainder, number;

		number = num;
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num /= 10;
		}

		if (number == reverse)
			System.out.println(number + " is a palindrome.");
		else
			System.out.println(number + " is not a palindrome.");
	}
}


