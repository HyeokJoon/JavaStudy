package com.test.question;

import java.util.Scanner;

public class Q076 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[][] score = new String[10][3];
		
		System.out.print("국어 점수: ");
		int kor = scan.nextInt() / 10;
		for(int i=0; i<kor; i++) {
			score[i][0] = "■";
		}
		
		System.out.print("영어 점수: ");
		int eng = scan.nextInt() / 10;
		for(int i=0; i<eng; i++) {
			score[i][1] = "■";
		}
		
		System.out.print("수학 점수: ");
		int math = scan.nextInt() / 10;
		for(int i=0; i<math; i++) {
			score[i][2] = "■";
		}
		
		for(int i=9; i>=0; i--) {
			for(int j=0; j<3; j++) {
				if(score[i][j] != null) 
					System.out.printf("%3s\t",score[i][j]);
				else 
					System.out.printf("\t");
			}
			System.out.println();
		}
		
		System.out.println(" --------------------");
		System.out.printf("%3s\t%3s\t%3s", "국어" , "영어" , "수학");
	}
}
