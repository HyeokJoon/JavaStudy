package com.test.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex63_TreeSet {
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(6);
		set.add(2);
		set.add(5);
		set.add(8);
		set.add(1);
		set.add(9);
		set.add(3);
		set.add(4);
		set.add(10);
		set.add(7);
		
		System.out.println(set);
		
		//범위 관련 기능 제공(=list 계열이 할 숭 ㅣㅆ음
		System.out.println(set.first());
		System.out.println(set.last());
		
		//첫 번째 부터 value값을 만나기 전까지 탐색
		System.out.println(set.headSet(3));		//(1,3)
		System.out.println(set.tailSet(7));		//(7,~)
		System.out.println(set.subSet(3, 7));	
		
		
		//hashSet & TreeSet > iterator, 향상된 for 문
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
