package com.test.question;

public class Q010 {
	public static void main(String[] args) {
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
	}
	public static void digit(int num) {
		
		String tmp = num>999 ? "" + num : "0000" + num;
		System.out.println();
	}
}
