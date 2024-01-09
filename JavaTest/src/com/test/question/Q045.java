package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q045 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("최대숫자: ");
		int input = Integer.parseInt(reader.readLine());
		
		for(int i=1; i<=input; i++) {
			int num = i;
			boolean flag = true;
			
			for(int j=0; j<3; j++) {
				int mod = num%10;
				num /= 10;
				if(mod == 3 ||mod == 6 ||mod == 9) {
					System.out.print("짝");
					flag = false;
				}
			}
			
			if(flag)
				System.out.print(i);
			System.out.print(" ");
		}
		
	}
}
