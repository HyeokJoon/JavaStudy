package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q051 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("행: ");
		int rows = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<rows; i++) {
			for(int k=rows-1; k>i; k--)
				System.out.print(" ");
			for(int j=0; j<1+2*i; j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
}
