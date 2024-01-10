package com.test.question;

public class Q078 {
	public static void main(String[] args) {
		int[][] nums = new int[5][5];
		
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		
		int dir = 0;
		int i=0,j=0;
		for(int n = 1; n<=25; n++) {
			nums[i][j] = n;
			
			int next_i = i+dx[dir];
			int next_j = j+dy[dir];
			if(next_i>4 || next_j>4 || next_i<0 || next_j<0 || nums[next_i][next_j]!=0) {
				dir = turnRight(dir);
			}
			i += dx[dir];
			j += dy[dir];
		}
		
		for( i=0; i<5; i++) {
			for( j=0; j<5; j++) {
				System.out.printf("%4d",nums[i][j]);
			}
			System.out.println();
		}
		
	}

	private static int turnRight(int dir) {
		dir += 1;
		dir %= 4;
		return dir;
	}
}
