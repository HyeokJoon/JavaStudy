package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q015 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sunny, foggy;
		
		System.out.print("맑은 날: ");
		String input = reader.readLine();
		sunny = Integer.parseInt(input);
		System.out.print("흐린 날: ");
		input = reader.readLine();
		foggy = Integer.parseInt(input);
		System.out.printf("사과가 총 %d개 열렸습니다.",getApple(sunny, foggy));
		
		
	}
	public static int getApple(int sunny, int foggy) {
		int length = sunny*5 + foggy*2;
		if(length <100) return 0;
		length -= 100;
		return length/10; 
	}
}
