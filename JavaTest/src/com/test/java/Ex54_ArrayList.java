package com.test.java;

import java.util.ArrayList;

public class Ex54_ArrayList {
	public static void main(String[] args) {
		
//		m1();
		m2();
	}

	private static void m2() {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("바나나");
		list.add("딸기");
		list.add("사과");
		list.add("포도");
		list.add("귤");
		
		//2. 요소 개수
		// int size()
		System.out.println(list.size());
		
		//3. 요소 읽기
		// T get(int index)
		System.out.println(list.get(2));
//		System.out.println(list.get(5)); // java.lang.IndexOutOfBoundsException
//		System.out.println("홍길동".charAt(5)); // java.lang.StringIndexOutOfBoundsException
		
		//4. 마지막 요소 읽기
		System.out.println(list.get(list.size()-1));
		
		//5. 요소 수정
		//T set(index, T newValue)
		String name = list.set(2, "파인애플");
		System.out.println(list.get(2));
		
		//6. 요소 삭제
		//T remove(int index) > 방번호를 찾아서 삭제
		//boolean remove(T value) > 값을 찾아서 삭제
		System.out.println(list.size());
		list.remove(2);
		System.out.println(list.size());
		
		
	}

	private static void m1() {
		
		//순수 배열 특징
		//- 타입 명시(int)
		//- 길이 명시(3)
		int[] nums1 = new int[3];
		
		//요소접근 > 첨자(index) 사용
		nums1[0] = 10;
		nums1[1] = 20;
		nums1[2] = 30;
		
		for(int i:nums1)
			System.out.println(i);
		
		
		//
		//ArrayList nums2 = new ArrayList();
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		
		//요소 접근 > 
		//- boolean add(T value)
		//- Append(차례대로 추가)
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		
		System.out.println(nums2.get(0));
		System.out.println(nums2.get(1));
		System.out.println(nums2.get(2));
		
		System.out.println(nums2.size());
		
		nums2.add(400);
		nums2.add(500);
		
		System.out.println(nums2.size());
		for(int i : nums2)
			System.out.println(i);
		
	}
}
