package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q014 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int station, change, time;
		
		
		System.out.print("역의 개수: ");
		String input = reader.readLine();
		station = Integer.parseInt(input);
		System.out.print("환승역의 횟수: ");
		input = reader.readLine();
		change = Integer.parseInt(input);
		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		input = reader.readLine();
		time = Integer.parseInt(input);
		
		System.out.printf("총 소요 시간은 %d분입니다.\n", getTime(station, change, time));
		
	}
	public static int getTime(int station, int change, int time) {
		int n = time +2;
		return station*2 + change * n;
	}
}
