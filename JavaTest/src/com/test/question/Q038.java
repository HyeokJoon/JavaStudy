package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q038 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력횟수: ");
		int N = Integer.parseInt(reader.readLine());
		
		int even_cnt=0, odd_cnt=0, even_sum=0, odd_sum=0;
		for(int i=0; i<N; i++) {
			System.out.print("숫자: ");
			int input = Integer.parseInt(reader.readLine());	
			if(input%2 ==0) {
				even_cnt++;
				even_sum += input;
			}else {
				odd_cnt++;
				odd_sum += input;
			}
		}
		System.out.printf("짝수 %d개의 합: %d\n",even_cnt, even_sum);
		System.out.printf("홀수 %d개의 합: %d\n",odd_cnt, odd_sum);
		
	}
}
