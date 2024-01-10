package com.test.question;

public class Q074 {
	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];
		
		int n = 1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i+j < 2 || i+j >=7 || i-j > 2 || j-i >2)
					continue;
				nums[i][j] = n;
				n++;
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d",nums[i][j]);
			}
			System.out.println();
		}
	}
}
