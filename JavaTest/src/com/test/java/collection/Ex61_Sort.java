package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex61_Sort {
	public static void main(String[] args) {
//		m1();
//		m2();
//		m3();
//		m4();
		m5();
	}

	private static void m5() {
		
//		User u1 = new User("홍길동", 1, 2023, 10, 1, "서울");
//		System.out.println(u1);
		
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User("홍길동", 1, 2023, 11, 1, "서울"));
		list.add(new User("아무개", 5, 2023, 2, 5, "부산"));
		list.add(new User("강아지", 2, 2023, 1, 12, "인천"));
		list.add(new User("고양이", 3, 2023, 4, 3, "광주"));
		list.add(new User("멍멍이", 1, 2023, 12, 12, "제주"));
		list.add(new User("망아지", 2, 2023, 9, 28, "인천"));
		list.add(new User("병아리", 4, 2023, 10, 16, "광주"));
		list.add(new User("송아지", 3, 2023, 8, 17, "부산"));
		list.add(new User("독수리", 1, 2023, 10, 19, "서울"));
		list.add(new User("햄스터", 2, 2023, 4, 7, "제주"));
		
		System.out.println(list);
		
		Collections.sort(list, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
//				return o1.getLevel() - o2.getLevel();
//				return o1.getName().compareTo(o2.getName());
//				return o1.getRegdate().compareTo(o2.getRegdate());
				
				//지역순 (city)
				//서울(1), 인천(2), 광주(3), 부산(4), 제주(5)
				
				int city1 = -1;
				int city2 = -1;
				
				city1 = getCityNumber(o1.getCity());
				city2 = getCityNumber(o2.getCity());
				return city1-city2;
			}

			private int getCityNumber(String city) {
				if(city == "서울")
					return 1;
				if(city == "인천")
					return 2;
				if(city == "광주")
					return 3;
				if(city == "부산")
					return 4;
				if(city == "제주")
					return 5;
				return 0;
			}
			
		});
		

		System.out.println(list);
	}

	private static void m4() {
		// TODO Auto-generated method stub
		Integer[] nums = {5,2,4,1,3};
		Arrays.sort(nums, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				//오름차순
//				return o1-o2;
				//내림차순
				return o2-o1;
			}
			
		});
		
		System.out.println(Arrays.toString(nums));
		
	}

	private static void m3() {

		String[] names = {"유재석", "홍길동", "박명수", "이순신","강감찬"};
		//익명 객체 사용
		Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		};
		
		Arrays.sort(names,c);
		System.out.println(Arrays.toString(names));
		
	}

	private static void m2() {
		// 내림차순
		
		String[] names = {"유재석", "홍길동", "박명수", "이순신","강감찬"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		MyComparator my = new MyComparator();
		Arrays.sort(names,my);
		
	}

	private static void m1() {
		//정렬 대상
		//1. 숫자
		
		//숫자 + 배열
		int[] nums1 = {1,5,3,4,3};
		
		System.out.println(Arrays.toString(nums1));
		//오름차순 정렬
		Arrays.sort(nums1);
		
		//내림차순 정렬?
		Arrays.sort(nums1);
		
		System.out.println(Arrays.toString(nums1));
		System.out.println();
		
		//숫자 + 컬렉션(list)
		
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(1);
		nums2.add(5);
		nums2.add(3);
		nums2.add(4);
		nums2.add(2);
		
		System.out.println(nums2);
		Collections.sort(nums2);
		System.out.println(nums2);
		System.out.println();
		
		
		//2. 문자(열)
		
		//문자열 + 배열
		String s1 = "Java";
		String s2 = "java";
		
		//System.out.println(s1 > s2);
		int result = compareString(s1,s2);
		System.out.println(result);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		//배열 
		String[] names = {"유재석", "홍길동", "박명수", "이순신","강감찬"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		ArrayList<String> names2 = new ArrayList<>();
		names2.add("유재석");
		names2.add("홍길동");
		names2.add("박명수");
		names2.add("이순신");
		names2.add("강감찬");
		Collections.sort(names2);
		System.out.println(names2);
		System.out.println();
		
		
		
		//3. 날짜시간
		Calendar[] clist = new Calendar[5];
		clist[0] = Calendar.getInstance();
		clist[0].add(Calendar.DATE, -5);
		clist[1] = Calendar.getInstance();
		clist[2] = Calendar.getInstance();
		clist[3] = Calendar.getInstance();
		clist[4] = Calendar.getInstance();
		
		for(int i=0; i<clist.length; i++) {
			System.out.printf("%tF\n",clist[i]);
		}
		System.out.println();
		
		
		ArrayList<Calendar> clist2 = new ArrayList<>();
		clist2.add(Calendar.getInstance());
		clist2.get(0).add(Calendar.DATE, -5);
		clist2.add(Calendar.getInstance());
		clist2.get(1).add(Calendar.DATE, 3);
		clist2.add(Calendar.getInstance());
		clist2.get(2).add(Calendar.DATE, -2);
		clist2.add(Calendar.getInstance());
		clist2.get(3).add(Calendar.DATE, 7);
		clist2.add(Calendar.getInstance());
		
		for(int i=0; i<clist2.size(); i++) {
			System.out.printf("%tF\n",clist2.get(i));
		}
		System.out.println();
		
		Collections.sort(clist2);
		for(int i=0; i<clist2.size(); i++) {
			System.out.printf("%tF\n",clist2.get(i));
		}
		System.out.println();
	}

	private static int compareString(String s1, String s2) {
		// 문자열 우위비교
		
		int length = Integer.min(s1.length(), s2.length());
		
		for(int i=0; i<length; i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if(c1>c2) {
				return 1;
			}else if(c2>c1){
				return -1;
			}
		}
		
		if(s1.length() > s2.length())
			return 1;
		else if(s2.length() > s1.length())
			return -1;
		
		return 0;
	}
}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {	
		//오름차순
//		return o1.compareTo(o2);
		//내림차순
		return o2.compareTo(o1);
	}
}

