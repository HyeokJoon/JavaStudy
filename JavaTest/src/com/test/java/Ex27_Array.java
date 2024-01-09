package com.test.java;

import java.util.Arrays;
import java.util.Calendar;

public class Ex27_Array {
	public static void main(String[] args) {
		
//		m1();
//		m2();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
//		m10();
		m11();
	}

	private static void m11() {
		int[] nums = new int[5];
		
		nums[0] = 95;
		nums[1] = 88;
		nums[2] = 67;
		nums[3] = 89;
		nums[4] = 64;
		
		int[] nums2 = new int[] {95,88,67,89,64};
		
		String[] names1 = new String[] {"홍길동","임정정","도깨비"};
		System.out.println(Arrays.toString(names1));
	}

	private static void m10() {
		
		
	}

	private static void m9() {
		
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		System.out.println(nums);
		//[I@2ff4acd0
		//- [I : int형 배열
		//- @ : 구분자
		//- 2ff4acd0 : heap영역 메모리 주소
		
		printArray(nums);
		System.out.println(Arrays.toString(nums));
		
		int[] copy;
		copy = Arrays.copyOfRange(nums, 0, nums.length);
		
		System.out.println(Arrays.toString(copy));
	}

	private static void printArray(int[] nums) {
		for(int num : nums)
			System.out.print(num+" ");
		System.out.println();
	}

	private static void m8() {
		
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		int[] copy = new int[3];
		for(int i=0; i<nums.length; i++) {
			copy[i] = nums[i];
		}
		nums[0] = 100;
		System.out.println(copy[0]);
	}

	private static void m7() {
		// TODO Auto-generated method stub
		int a =10;
		changeValue(a);
		
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		changeArray(nums[0]);
		System.out.println(nums[0]);
	}

	private static void changeArray(int nums) {
		nums = 1;
	}

	private static void changeValue(int a) {
		a = 20;
		System.out.println(a);
	}

	private static void m6() {
		//값형 복사
		int a = 10;
		int b;
		
		b = a;
		
		a = 20; //원본 수정
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		System.out.println();
		
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		int[] copy;
		copy = nums;
		
		System.out.println(copy[0]);
		System.out.println(copy[1]);
		System.out.println(copy[2]);
		
		nums[0] = 100;
		System.out.println(copy[0]);
		
		copy[1] = 200;
		System.out.println(nums[1]);
	}

	private static void m5() {
		//값형 vs 참조형
		//- 값형 > 변수에 데이터를 직접 저장
		//- 참조형 > 데이터는 따로 생성 + 변수에 메로리 주소값 저장
		
		//****원인
		//- 데이터의 크기가 고정 > 값형
		//- 데이터의 크기가 일정하지 않음 > 참조형
		
		String s1 = "홍길동";
		// s1의 메모리 크기??
		// 6byte
		// s1의 참조변수의 크기 : (=주소값의 크기)int형 
	}

	private static void m4() {
		// 각 자료형 > 배열
		//정수 타입배열 (byte, short, int, long)
		byte[] list1 = new byte[5];
		list1[0] = 10;
		System.out.println(list1[0]);
		
		//실수 배열(float, double)
		double[] list2 = new double[5];
		list2[0] = 3.14;
		System.out.println(list2[0]);
		
		//문자 배열(char) == String
		char[] list3 = new char[5];
		list3[0] = 'A';
		System.out.println(list3[0]);
		
		//논리 배열(boolean)
		boolean[] list4 = new boolean[5];
		list4[0] = true;
		System.out.println(list4[0]);
		
		//참조형 배열
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);
		
		Calendar c1 = Calendar.getInstance();
		Calendar[] list6 = new Calendar[5];
		list6[0] = Calendar.getInstance();
		System.out.println(list6[0]);
		
	}

	private static void m2() {
		int[] nums = new int[10];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		
		for(int i=0; i<nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i,nums[i]);
		}
	}

	private static void m1() {
		int[] kors = new int[3];
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		
//		int total = kors[0] + kors[1] + kors[2];
		int total = 0;
		for(int i=0; i<kors.length; i++) {
			total += kors[i];
		}
		
		double avg = total / (double)kors.length;
		System.out.println(avg);
	}
}
