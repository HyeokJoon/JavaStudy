package com.test.question;

public class Q070 {
	public static void main(String[] args) {
		
		for(int i=1; i<=25; i++) {
			System.out.printf("%3d",i);
			if(i%5 == 0)
				System.out.println();
		}
	}
}
