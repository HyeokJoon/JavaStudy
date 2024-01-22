package com.test.question;

import java.io.File;

public class Q115 {
	public static void main(String[] args) {
		String path = "C:\\Users\\User\\Downloads\\파일 디렉토리 문제\\파일 제거";
		
		File dir = new File(path);
		
		int cnt = 0;
		File[] list = dir.listFiles();
		for(File file : list) {
			if(file.isFile() && file.length() == 0) {
				file.delete();
				cnt ++;
			}
		}
		
		System.out.printf("총 %d개의 파일을 삭제했습니다.",cnt);
	}
}
