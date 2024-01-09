package com.test.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex28_Sort {

	public static void main(String[] args) {
		
//		m1();
//		m2();
		m3();
	}

	private static void m3() {
		int[] nums = new int[]{1,5,3,2,4};
		String[] names = {"홍길동","아무개", "테스트", "유재석", "강아지", "고양이", "도깨비", "박명수", "조세호", "병아리"};
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	}

	private static void m2() {
		String[] names = {"홍길동","아무개", "테스트", "유재석", "강아지", "고양이", "도깨비", "박명수", "조세호", "병아리"};
		
		String name1 = "a";
		String name2 = "b";
		
		for(int i=0; i<names.length-1; i++) {
			for(int j=0; j<names.length-1-i; j++) {
				if(names[j].compareTo(names[j+1])<0) {
					String temp2 = names[j];
					names[j] = names[j+1];
					names[j+1] = temp2;
				}
			}
		}
		System.out.println(Arrays.toString(names));
		
	}

	private static void m1() {
		int[] nums = new int[]{1,5,3,2,4};
		
		System.out.println(Arrays.toString(nums));
		for(int i=0; i<nums.length-1; i++) {
			for(int j=0; j<nums.length-1-i; j++) {
				//오름차순
				if(nums[j] < nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
				//내림차순
				if(nums[j] < nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
