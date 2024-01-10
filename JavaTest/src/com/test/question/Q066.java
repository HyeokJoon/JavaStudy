package com.test.question;

import java.util.Arrays;

public class Q066 {
	public static void main(String[] args) {
		
		int[] rotto = new int[6];
		for(int i=0; i<6; i++) {
			rotto[i] = (int)(Math.random()*100) %45 + 1;
		}
		Arrays.sort(rotto);
		System.out.println(Arrays.toString(rotto));
	}
}
