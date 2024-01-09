package com.test.question;

public class Q055 {
	public static void main(String[] args) {
		
		for(int i=2; i<100; i++) {
			String result = "[1,";
			int sum = 1;
			for(int j=2; j<i; j++) {
				if(i%j == 0 )
				{
					sum += j;
					result += " " + j + ",";
				}
			}
			if(sum == i) {
				System.out.println(i + " = " + result+"]");
			}
		}
	}
}
