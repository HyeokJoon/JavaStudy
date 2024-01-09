package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q044 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String oper = "";
		
		int sum = 0;
		while(sum <= 100) {
			System.out.print("숫자 : ");
			int input = Integer.parseInt(reader.readLine());
			if(input % 2 ==0) {
				sum += input;
				oper += " + " + input;
			}
				
			else {
				sum -= input;
				oper += " - " + input;
			}
		}
		System.out.println(oper + " = " + sum);
	}
}
