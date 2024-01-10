package com.test.question;

import java.util.Arrays;

public class Q065 {
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
		for(int i=0; i<19; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println(nums[19]);
		
		System.out.print("결과: ");
		for(int i=0; i<20; i++) {
			if(nums[i] >= 5 && nums[i] <=15)
				System.out.print(nums[i] + ", ");
		}
		
	}
}
