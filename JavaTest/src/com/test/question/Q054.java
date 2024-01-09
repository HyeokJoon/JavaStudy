package com.test.question;

public class Q054 {
	public static void main(String[] args) {
		for(int i=1; i<100; i++) {
			if(isPrime(i)) {
				System.out.print(i + ", ");
			}
		}
	}

	private static boolean isPrime(int num) {
		for(int i = 2; i<num; i++) {
			if(num%i == 0)
				return false;
		}
		return true;
	}
}
