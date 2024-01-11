package com.test.question;

import java.util.Scanner;

public class Q088 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] word = {"바보", "멍청이"};
		String[] masking = {"**", "***"};
		
		System.out.print("입력: ");
		String input = scan.nextLine();
		
		boolean flag = true;
		int cnt =0;
		while(flag) {
			flag = false;
			for(int i=0; i<word.length; i++) {
				int idx = input.indexOf(word[i]);
				if(idx == -1)
					continue;
				else {
					flag = true;
					input = input.replaceFirst(word[i], masking[i]);
//					System.out.println(input);
					cnt ++;
				}
			}
		}
		
		System.out.println(input);
		System.out.println("금지어를 "+cnt+"회 마스킹했습니다.");
	}
}
