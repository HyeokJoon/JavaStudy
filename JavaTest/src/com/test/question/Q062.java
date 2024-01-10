package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q062 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수: ");
		int N = scan.nextInt();
		String[] names = new String[N];
		
		scan.nextLine();
		for(int i=0; i<N; i++) {
			System.out.print("학생명: ");
			String name = scan.nextLine();
			names[i] = name;
		}
		
		Arrays.sort(names);
		
		System.out.printf("입력한 학생은 총 %d명 입니다.\n",N);
		for(int i=0; i<N; i++) {
			System.out.printf("%d. %s\n", i+1, names[i]);
		}
		scan.close();
	}
}
