package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Ex56_HashMap {
	public static void main(String[] args) {
//		m1();
//		m2();
		m3();
	}

	private static void m3() {
		HashMap<String, String> map = new HashMap<>();
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		
		//loop 탐색
		Set<String> keys = map.keySet();
		
		//keys 출력
		System.out.println(keys);
		
		//keys 하나씩 출력
		for(String item: keys)
			System.out.println(item);
		
		//values 출력
		Collection<String> values = map.values();
		System.out.println(values);
		
		//values 하나씩 출력
		for(String item:values)
			System.out.println(item);
		
	}

	private static void m2() {
		HashMap<String, String> map = new HashMap<>();
		map.clear();
	}

	private static void m1() {
		
		//학생 1명의 국어, 영어, 수학 점수 저장
		
		//1. 배열
		int[] s1 = new int[3];
		s1[0] = 100;
		s1[1] = 90;
		s1[2] = 80;
		
		System.out.println(s1[0] + s1[1] + s1[2]);
		
		//2. ArrayList
		ArrayList<Integer> s2 = new ArrayList<>();
		s2.add(100);
		s2.add(90);
		s2.add(80);
		System.out.println(s2.get(0)+s2.get(1)+s2.get(2));
		
		//3. Class
		Score s3 = new Score(100,90,80);
		System.out.println(s3.getTotal());
		
		//4. HashMap
		HashMap<String, Integer> s4 = new HashMap<>();
		
		s4.put("kor", 100);
		s4.put("eng", 90);
		s4.put("math", 80);
		
		System.out.println(s4.get("kor")+s4.get("eng")+s4.get("math"));
		
	}
}

class Score{
	private int kor;
	private int eng;
	private int math;
	
	public Score() {
		this.kor = 0;
		this.eng = 0;
		this.math = 0;
	}
	
	public Score(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor+this.eng+this.math;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}