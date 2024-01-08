package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q021 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Calendar today = Calendar.getInstance();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("태어난 년도: ");
		int year = Integer.parseInt(reader.readLine());
		
		System.out.printf("나이: %d세",today.get(Calendar.YEAR)-year+1);
	}
}
