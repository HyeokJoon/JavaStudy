package com.test.question;

public class Q071 {
	public static void main(String[] args) {
		for(int i=25; i>0; i--) {
			System.out.printf("%3d",i);
			if(i%5 == 1)
				System.out.println();
		}
	}
}
