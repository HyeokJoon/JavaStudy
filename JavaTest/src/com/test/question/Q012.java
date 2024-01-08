package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q012 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자: ");
		String input = reader.readLine();
		int n = Integer.parseInt(input);
		String result;
		result = getNumber(n); 
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);
	}
	public static String getNumber(int num) {
		return num %2 == 0 ? "짝수" : "홀수";
	}
	
}
