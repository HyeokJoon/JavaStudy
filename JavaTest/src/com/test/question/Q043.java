package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q043 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		System.out.println();
		int num = (int)(Math.random()*10);
		
		int i;
		for(i = 1; i<=10; i++) {
			System.out.print("숫자 : ");
			int input = Integer.parseInt(reader.readLine());
			if(num == input) {
				System.out.println("맞았습니다.\n");
				break;
			}
			else {
				System.out.println("틀렸습니다.\n");
			}
		}
		
		if(i<=10) {
			System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n",num);		
			System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n\n", i);	
		}
		else {
			System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n",num);		
			System.out.printf("모든 기회를 실패했습니다.\n\n");
		}
		System.out.println("프로그램을 종료합니다.");
		
	}
}
