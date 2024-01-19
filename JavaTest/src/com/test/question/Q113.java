package com.test.question;

import java.io.File;

public class Q113 {
	public static void main(String[] args) {
		String path = "C:\\Users\\User\\Downloads\\파일 디렉토리 문제\\음악 파일\\Music";
		File dir = new File(path);
		if(dir.exists()) {
			File[] list = dir.listFiles();
			for(int i=0; i<list.length; i++) {
				System.out.printf("[%03d]",i+1);
				System.out.println(list[i].getName());
			}
		}else {
			System.out.println("디렉터리가 없습니다.");
		}
	}
}
