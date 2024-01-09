package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q040 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.print("시작 숫자: ");
		int start = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자: ");
		int end = Integer.parseInt(reader.readLine());
		
		int cnt = 0;
		int result = 0;
		for(int i= start; i<end; i++) {
			System.out.print(i);
			if(cnt++%2 == 0) {
				result += i;
				System.out.print(" - ");
			}else {
				result -=i;
				System.out.print(" + ");
			}
		}
		if(cnt%2==0)
			result +=end;
		else result -=end;
		System.out.print(end + " = " + result);
	}
}
