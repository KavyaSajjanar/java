package com.xworkz.alpha.alphapattern;

public class XPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 4;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i == j || i + j == num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}


