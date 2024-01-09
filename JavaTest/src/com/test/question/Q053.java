package com.test.question;

public class Q053 {
	public static void main(String[] args) {
		for(int i=2; i<10; i+=4) {
			for(int j=1; j<10; j++) {
				for(int k=0; k<4; k++) {
					System.out.printf("%d x %d = %d\t", i+k,j,(i+k)*j);	
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

