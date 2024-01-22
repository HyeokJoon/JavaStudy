package com.test.question;

import java.io.File;

public class Q116 {
	public static void main(String[] args) {
		String pathA = "C:\\Users\\User\\Downloads\\파일 디렉토리 문제\\동일 파일\\MusicA";
		String pathB = "C:\\Users\\User\\Downloads\\파일 디렉토리 문제\\동일 파일\\MusicB";
		
		File dirA = new File(pathA);

		String filename = null;
		
		File[] listA = dirA.listFiles();
		for(File fileA : listA) {
			filename = fileA.getName();
//			System.out.println(filename);
			
			String path = pathB +"\\"+ filename;
			File tmp = new File(path);
			
			if(tmp.exists()) {
				System.out.println(filename);
			}
		}
		
	}
}
