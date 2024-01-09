package com.test.question;

public class Q060 {
	public static void main(String[] args) {
		int prev = 0;
		int now = 1;
		int result = 0;
		while(now < 100) {
			System.out.print(now + " + ");
			result += now;
			int tmp = now;
			now += prev;
			prev = tmp;
		}
		System.out.println(" = " + result);
	}
}
