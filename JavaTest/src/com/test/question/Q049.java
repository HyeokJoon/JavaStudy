package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q049 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("행: ");
		int rows = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<rows; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
