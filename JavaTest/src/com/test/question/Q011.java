package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q011 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자: ");
		String input = reader.readLine();
		int n1 = Integer.parseInt(input);
		System.out.print("두번째 숫자: ");
		input = reader.readLine();
		int n2 = Integer.parseInt(input);
		
 
		String result;
		result = add(n1, n2); 
		System.out.println(result);

		result = subtract(n1, n2);
		System.out.println(result);

		result = multiply(n1, n2);
		System.out.println(result);

		result = divide(n1, n2);
		System.out.println(result);

		result = mod(n1, n2);
		System.out.println(result);
	}
	public static String add(int num1, int num2) {
		int result = num1 + num2;
		return ""+ num1 + " + " + num2 + " = " + result;
	}
	public static String subtract(int num1, int num2) {
		int result = num1 - num2;
		return ""+ num1 + " - " + num2 + " = " + result;
	}
	public static String multiply(int num1, int num2) {
		int result = num1 * num2;
		return ""+ num1 + " * " + num2 + " = " + result;
	}
	public static String divide(int num1, int num2) {
		double result = (double)num1 / num2;
		return ""+ num1 + " / " + num2 + " = " + result;
	}
	public static String mod(int num1, int num2) {
		int result = num1 % num2;
		return ""+ num1 + " % " + num2 + " = " + result;
	}
}
