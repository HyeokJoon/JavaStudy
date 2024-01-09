package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q056 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자: ");
		int num1 = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자: ");
		int num2 = Integer.parseInt(reader.readLine());
		
		String child1 = "";
		String child2 = "";
		String same = "";
		for(int i=1; i<=num1 && i<=num2; i++) {
//			System.out.println(i);
			if(num1%i ==0 && num2%i ==0) {
				same += i + ", ";
				child1 +=i + ", ";
				child2 +=i + ", ";
				continue;
			}
			if(num1%i == 0)
				child1 +=i + ", ";
			if(num2%i == 0)
				child2 +=i + ", ";
		}
		System.out.printf("%d의 약수: %s\n", num1, child1);
		System.out.printf("%d의 약수: %s\n", num2, child2);
		System.out.printf("%d와 %d의 공약수: %s\n", num1,num2, same);
	}
}
