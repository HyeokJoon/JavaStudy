package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q023 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(reader.readLine());
		System.out.println("아빠 생일(년): ");
		System.out.println("아빠 생일(월): ");
		System.out.println("아빠 생일(일): ");
		System.out.println("딸 생일(년): ");
		System.out.println("딸 생일(월): ");
		System.out.println("딸 생일(일): ");
	}
}
