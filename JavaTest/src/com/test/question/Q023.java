package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q023 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("아빠 생일(년): ");
		int year = Integer.parseInt(reader.readLine());
		System.out.println("아빠 생일(월): ");
		int month = Integer.parseInt(reader.readLine());
		System.out.println("아빠 생일(일): ");
		int day = Integer.parseInt(reader.readLine());
		Calendar father = Calendar.getInstance();
		father.set(year, month, day);
		
		System.out.println("딸 생일(년): ");
		year = Integer.parseInt(reader.readLine());
		System.out.println("딸 생일(월): ");
		month = Integer.parseInt(reader.readLine());
		System.out.println("딸 생일(일): ");
		day = Integer.parseInt(reader.readLine());
		Calendar daughter = Calendar.getInstance();
		daughter.set(year, month, day);
		
		long gap = daughter.getTimeInMillis()- father.getTimeInMillis();
		System.out.printf("아빠는 딸보다 총 %,d일 더 살았습니다.", gap/1000/3600/24);
	}
}
