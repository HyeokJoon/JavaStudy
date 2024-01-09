package com.test.question;

public class Q041 {

	public static void main(String[] args) {
		int i = 2;
		int sum = 1;
		System.out.print(1);
		while(sum <= 1000) {
			sum += i;
			System.out.print(" + " + i);
			if(sum > 1000)
				System.out.print(" = " + sum);
			i++;
		}
	}
}
