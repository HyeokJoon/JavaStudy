package com.test.question;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;

public class Q114 {

	public static void main(String[] args) {
		String path = "C:\\Users\\User\\Downloads\\파일 디렉토리 문제\\확장자별 카운트";
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		HashMap<String, Integer> map = new HashMap<>();
		
		String exp = null;
		for(File file : list) {
			if(file.isFile()) {
//				System.out.println(file.getName());
				exp = file.getName().split("\\.")[1];
				String key = "*."+exp;
				
				if(map.get(key) == null) {
					map.put(key, 1);
				}
				else {
					map.put(key, map.get(key)+1);	
				}
			}
		}
		
		Collection<String> keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(key+": "+map.get(key) + "개");
		}
		
		
	}
}
