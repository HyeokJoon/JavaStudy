package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q037 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자: ");
		int input = Integer.parseInt(reader.readLine());
		int sum = 0;
		for(int i=1; i<=input; i++) {
			sum += input;
		}
		System.out.print(sum);
	}
}
