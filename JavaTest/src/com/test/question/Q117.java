package com.test.question;

import java.io.File;

public class Q117 {
	static int countfile = 0;
	static int countfolder = 0;
	public static void main(String[] args) {
		String path = "C:\\Users\\User\\Downloads\\파일 디렉토리 문제\\폴더 삭제\\delete";
		
		File dir = new File(path);
		
		if(dir.exists()) {
			
			deleteFiles(dir);
			System.out.println("폴더를 삭제했습니다.");
			System.out.printf("삭제된 폴더는 %d개이고, 파일은 %d개입니다.",countfolder, countfile);
		}else {
			System.out.println("디렉터리 없음");
		}
		
	}

	private static void deleteFiles(File dir) {
		File[] list = dir.listFiles();
		
		for(File file : list) {
			if(file.isFile()) {
				file.delete();
				countfile++;
			}else {
				deleteFiles(file);
			}
		}
		dir.delete();
		countfolder++;
	}
}
