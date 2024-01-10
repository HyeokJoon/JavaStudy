package com.test.question;

import java.util.Arrays;

public class Q064 {
	public static void main(String[] args) {
		
		int[] nums = new int[20];
		
		int min= 20, max = 0;
		for(int i=0; i<20; i++) {
			int num = (int)(Math.random()*1000)%20+1;
			nums[i] = num;
			if(min > num)
				min = num;
			if(max < num)
				max = num;
		}
		
		System.out.print("원본: ");
		for(int i=0; i<20; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println();
		System.out.print("최댓값: "+ max + "\n");
		System.out.print("최솟값: "+ min);
	}
}
