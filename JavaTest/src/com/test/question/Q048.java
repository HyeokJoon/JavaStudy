package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q048 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(reader.readLine());
		
		int odd = 0, even = 0;
		while(input > 0) {
			int num = input%10;
			if(num %2 ==0)
				even+=num;
			else 
				odd+=num;
			input /=10;
		}
		System.out.println("짝수의 합: " + even);
		System.out.println("홀수의 합: " + odd);
	}
}
