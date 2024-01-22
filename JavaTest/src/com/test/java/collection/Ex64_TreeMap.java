package com.test.java.collection;

import java.util.TreeMap;

public class Ex64_TreeMap {
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();
		
		map.put("white", "흰색");
		map.put("black", "검정색");
		map.put("red", "빨강");
		map.put("blue", "파랑");
		map.put("yellow", "노랑");
		
		System.out.println(map);
		
		System.out.println(map.get("white"));
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.keySet());
		
		System.out.println(map.firstEntry());
		System.out.println(map.lastEntry());
		System.out.println(map.entrySet());
		
		System.out.println(map.headMap("m"));
		System.out.println(map.tailMap("m"));
		System.out.println(map.subMap("r", "w"));
	}
}
