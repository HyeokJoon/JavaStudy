package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("행: ");
		int rows = Integer.parseInt(reader.readLine());
		int end = 'a';
		for(int i=0; i<rows; i++) {
			for(int j=i+1; j<rows; j++) {
				System.out.print(" ");
			}
			for(int j = 'a'; j<=end; j++ ) {
				System.out.print((char)j);
			}
			for(int j = end; j>='a'; j--) {
				System.out.print((char)j);
			}
			System.out.println();
			end++;
		}
		
	}
}
