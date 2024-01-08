package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q013 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int kor, eng, math;
		System.out.print("국어: ");
		String input = reader.readLine();
		kor = Integer.parseInt(input);
		System.out.print("영어: ");
		input = reader.readLine();
		eng = Integer.parseInt(input);
		System.out.print("수학: ");
		input = reader.readLine();
		math = Integer.parseInt(input);
		
		System.out.printf("%s입니다.", test(kor, eng, math));
	}
	public static String test(int kor, int eng, int math) {
		double avg = (kor+eng+math) /3;
		return (avg < 60 || kor < 40 || eng <40 || math < 40) ? "불합격" : "합격";
	}
}
