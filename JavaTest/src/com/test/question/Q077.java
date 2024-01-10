package com.test.question;

public class Q077 {
	public static void main(String[] args) {
		int[][] nums = new int[5][5];
		
		int n = 1;
		//왼쪽 위
		for(int j=0; j<5; j++) {
			int k = j;
			for(int i=0; i<=j; i++) {
				nums[i][k] = n;
				n++;
				k--;
			}
		}
		//오른쪽 아래
		for(int i=1; i<5; i++) {
			int k = i;
			for(int j=4; j>=i; j--) {
				nums[k][j] = n;
				n++;
				k++;
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
