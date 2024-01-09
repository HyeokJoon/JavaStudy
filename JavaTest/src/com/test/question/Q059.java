package com.test.question;

public class Q059 {
	public static void main(String[] args) {
		int num = 1;
		int tmp = 1;
		int result = 0;
		while(num < 100) {
			System.out.print(num + " + ");
			result += num;
			num += tmp++;
		}
		System.out.print(" = " + result);
	}
}
