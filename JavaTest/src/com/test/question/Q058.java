package com.test.question;

public class Q058 {
	public static void main(String[] args) {
		int sum = 0;
		int start = 1;
		for(int i=1; i<=100; i++) {
			sum += i;
			if(i%10 == 0) {
				System.out.printf("%2d ~ %3d: %4d\n",start,i,sum);
				sum = 0;
				start = i+1;
			}
		}
	}
}

// 1-10
// 11-20
// 21-30