package com.test.question;

public class Q075 {
	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];
		
		int n = 1;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				nums[i][j] = n;
				n++;
			}
		}
		
		for(int i=0; i<4; i++) {
			nums[i][4] = 0; 
			for(int j=0; j<4; j++) {
				nums[i][4] += nums[i][j];
			}
		}
		
		for(int j=0; j<5; j++) {
			nums[4][j] = 0;
			for(int i=0; i<4; i++) {
				nums[4][j] += nums[i][j];
			}
		}
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%4d",nums[i][j]);
			}
			System.out.println();
		}
	}
}
