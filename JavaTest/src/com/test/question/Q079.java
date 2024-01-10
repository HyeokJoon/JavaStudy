package com.test.question;

public class Q079 {
	public static void main(String[] args) {
		int[][] map = new int[3][3];
		int i = 1;
		int j = 2;
		for(int n = 1; n<10; n++) {
//			System.out.println("i: "+i+" j: "+j);
			map[i][j] = n;
			int ni = i-1;
			int nj = j+1;
			
			//다음 좌표가 범위 밖인지
			nj = (nj>2)? nj-3 : nj; 
			ni = (ni<0)? ni+3 : ni;
			
			//다음 좌표에 숫자가 있는지
			if(map[ni][nj]!=0)
			{
				j--;
				continue;
			}
			else {
				i = ni;
				j = nj;
			}
		}
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.printf("%2d",map[i][j]);
			}
			System.out.println();
		}
	}
}
