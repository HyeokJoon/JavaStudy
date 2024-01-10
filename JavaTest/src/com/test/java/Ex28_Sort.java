package com.test.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex28_Sort {

	public static void main(String[] args) {
		
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
		m9();
	}

	private static void m9() {
		
		int[][] nums = new int[5][5];
		
		int n = 1;
		for(int i=0; i<5; i++) {
			for(int j=4; j>=0; j--) {
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

	private static void m8() {
		int[] nums1 = {10,20,30};
		
		int[][] nums2 = {{10,20,30},{40,50,60}};
		
		int[][][]nums3 = {{{10,20,30},{40,50,60}},
					{{70,80,90},{100,110,120}}};
		
		//Jagged Array
		
		int[][] nums5 = {{10,20,30},{40,50}, {60,70,80,90}};
		for(int i=0; i<nums5.length; i++) {
			for(int j=0; j<nums5[i].length; j++) {
				System.out.print(nums5[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void m7() {
		//3차원 배열
		int[][][] nums3 = new int[2][2][3];
		
		nums3[0][0][0] = 10;  
		nums3[0][0][1] = 20;    
		nums3[0][0][2] = 30;
		
		nums3[0][1][0] = 40;  
		nums3[0][1][1] = 50;    
		nums3[0][1][2] = 60;
		
		nums3[1][0][0] = 70;  
		nums3[1][0][1] = 80;    
		nums3[1][0][2] = 90;
		
		nums3[1][1][0] = 100;  
		nums3[1][1][1] = 110;    
		nums3[1][1][2] = 120;
		
		System.out.println(Arrays.deepToString(nums3));
		System.out.println();
		
		for(int i=0; i<nums3.length; i++) {
			for(int j=0; j<nums3[0].length; j++) {
				for(int k=0; k<nums3[0][0].length; k++) {
					System.out.print(nums3[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

	private static void m6() {
		//1차원 배열
		int[] nums1 = new int[3];
		
		nums1[0] = 10;
		nums1[1] = 20;
		nums1[2] = 30;
		
		System.out.println(Arrays.toString(nums1));
		System.out.println();
		
		int[][] nums2 = new int[2][3];
		
		
		nums2[0][0] = 10; 
		nums2[0][1] = 20;
		nums2[0][2] = 30;
		
		nums2[1][0] = 40; 
		nums2[1][1] = 50;
		nums2[1][2] = 60;
		
		System.out.println(Arrays.toString(nums2));
		System.out.println(Arrays.deepToString(nums2));
		
		System.out.println(nums2.length);
		System.out.println(nums2[0].length);
		
		for(int i=0; i<nums2.length; i++) {
			for(int j=0; j<nums2[0].length; j++) {
				System.out.print(nums2[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

	private static void m5() {

		int[] nums = {1,2,3,4,5};
		int index = 1;
		
		System.out.println(Arrays.toString(nums));
		
		for(int i=index; i<nums.length-1; i++) {
			nums[i] = nums[i+1];
			System.out.println(Arrays.toString(nums));
		}
		nums[nums.length-1] = 0;
		System.out.println(Arrays.toString(nums));
		
	}

	private static void m4() {
		int[] nums = {1,2,3,4,5};
		int index = 1;
		int value = 9;
		
		System.out.println("nums[0] = " + nums[0]);
		System.out.println("nums[3] = " + nums[3]);
		
		System.out.println(Arrays.toString(nums));
		
		for(int i= nums.length-2; i>=index ; i--) {
			//System.out.println(i);
			nums[i+1] = nums[i];
			System.out.println(Arrays.toString(nums));
		}
		nums[index] = value;
		System.out.println(Arrays.toString(nums));
		
		System.out.println("nums[0] = " + nums[0]);
		System.out.println("nums[3] = " + nums[3]);
		
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
