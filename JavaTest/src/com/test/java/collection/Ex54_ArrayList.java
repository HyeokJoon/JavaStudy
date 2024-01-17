package com.test.java.collection;

import java.util.ArrayList;
import java.util.Random;

import com.test.java.obj.MyArrayList;

public class Ex54_ArrayList {
	public static void main(String[] args) {
		
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
		m8();
	}

	private static void m8() {
		//배열 생성
		MyArrayList list = new MyArrayList();
		
		System.out.println(list);
		
		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");
//		list.add("호호호");
		System.out.println(list);
//		list.add("후후후");
//		list.add("헤헤헤");
//		list.add("가가가");
//		list.add("나나나");
//		System.out.println(list);
//		list.add("다다다");
//		System.out.println(list);
		
		
		//읽기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		//개수
		System.out.println(list.size());

		//탐색 + 읽기
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}

		//수정
		list.set(0, "우하하");
		System.out.println(list.get(0));
		
		//삭제
		list.remove(1);
//		System.out.println(list);
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}

		//삽입
		list.add(1, "호호호");
//		System.out.println(list);
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}

		//검색
		if (list.indexOf("홍길동") > -1) {
		      System.out.println("홍길동 있음");
		} else {
		      System.out.println("홍길동 없음");
		}

		//초기화
		list.clear();
		System.out.println(list.size());
//		System.out.println(list);
		
	}

	private static void m7() {
		ArrayList<Integer> nums = new ArrayList<>();
		System.out.println(nums.size());
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		
		System.out.println(nums.size());
		
	}

	private static void m6() {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("강아지");
		names.add("고양이");
		names.add("참새");
		
		//dump
		//모든 컬렉션은 dump가 되어있음
		//toString() 재정의
		
		System.out.println(names.toString());
		
		
	}

	private static void m5() {
		
		//선택? 	
		//1. 배열 		> 길이 고정 > 학생 수 정확(고정)	
		//2. ArrayList 	> 길이 가변 > 학생 수 불명확
		
		//성적표
		ArrayList<Student> list = new ArrayList<Student>(); // 학생 명단
		Random rnd = new Random();
		
		String[] names = {"홍길동", "아무개", "강아지", "고양이", "병아리"};
		for(int i=0; i<5; i++) {
			Student s = new Student(); //학생 1명
			s.setNo(i+1);
			s.setName(names[i]);
			s.setMath(rnd.nextInt(41)+60); //60~100점
			s.setKor(rnd.nextInt(41)+60);
			s.setEng(rnd.nextInt(41)+60);
			
			list.add(s);
		}
		
//		for(Student s : list)
//			System.out.println(s);
		
		System.out.println("======================================================");
		System.out.println("                      성적표");
		System.out.println("======================================================");
		System.out.println("[번호]\t[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]\n");
		
		for(Student s: list) {
			System.out.printf("%4d\t%s\t%4d\t%4d\t%4d\t%4d\t%4.1f\n",
					s.getNo(),
					s.getName(),
					s.getKor(),
					s.getEng(),
					s.getMath(),
					s.getTotal(),
					s.getAvg());
		}
		
		
	}

	private static void m4() {
		//객체 배열
		ArrayList<Cup> list = new ArrayList<Cup>();
		
		Cup cup = new Cup("whilt",5000);
		list.add(cup);
		
		list.add(new Cup("blue",3000));
		list.add(new Cup("yellow", 4500));
		
		for(Cup i : list)
			System.out.println(i);
		
	}

	private static void m3() {
		int[] 	  ns1 = new int[3];
		int[][]   ns2 = new int[2][3];
		int[][][] ns3 = new int[2][3][4]; 
		
		//ns1
		ArrayList<Integer> ms1 = new ArrayList<Integer>();
		ms1.add(100);
		
		//ns2
		ArrayList<ArrayList<Integer>> ms2 = new ArrayList<ArrayList<Integer>>();
		ms2.add(new ArrayList<Integer>());
		ms2.get(0).add(10);
		
		//n3
		ArrayList<ArrayList<ArrayList<Integer>>> ms3
			= new ArrayList<ArrayList<ArrayList<Integer>>>();
		ms3.add(new ArrayList<ArrayList<Integer>>());
		ms3.get(0).add(new ArrayList<Integer>());
		ms3.get(0).get(0).add(1000);
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
		//시프트 발생 > 삭제된 방 이후로 모든 요소의 방번호 -1
		System.out.println(list.size());
		list.remove(2);
		System.out.println(list.size());
		
		//7. 요소 추가
		//원하는 요소 추가
		//Insert Mode
		//void add(int index, T value)
		//시프트 발생 > 삽입된 방 이후의 모든 요소는 방번호 +1
		System.out.println(list.size());
		list.add(2, "망고");
		System.out.println(list.size());
		
		//8. 요소 검색
		//- int indexOf(T value)
		//- int lastIndexOf(T value)
		//- boolean contains(T value)
		System.out.println(list.indexOf("포도"));
		System.out.println(list.lastIndexOf("포도"));
		System.out.println(list.indexOf("포도"));
		
		
		//9. 요소 탐색
		
		//for문
		//- 향상된 for문(Enhanced for statement)
		for(String item : list) {
			System.out.println(item);
		}
		
		//10. 초기화
		//- void clear()
		list.clear();
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		list.add("사과");
		System.out.println(list.isEmpty());
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

class Cup{
	private String color;
	private int price;
	
	public Cup(String color, int price) {
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cup [color=" + color + ", price=" + price + "]";
	}
	
}

class Parent{
	
	private int a;
	private int b;
	
//	public Parent() {
//		this.a = 0;
//		this.b = 0;
//	}
	public Parent(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Parent [a=" + a + ", b=" + b + "]";
	}
}

class Child extends Parent{
	private int c;
	private int d;
	
//	public Child() {
//		this.c = 0;
//		this.d = 0;
//	}
	
	public Child(int c, int d) {
		super(0,0);
		this.c = c;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Child [c=" + c + ", d=" + d + "]";
	}
	
}









