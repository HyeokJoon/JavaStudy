package com.test.question;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class Q118 {
	public static void main(String[] args) {
		String path = "C:\\Users\\User\\Downloads\\파일 디렉토리 문제\\크기 정렬";
		
		File dir = new File(path);
		
		ArrayList<File> list = new ArrayList<File>();
		//HashMap<Long, File> map = new HashMap<>();

		searchFile(dir, list);
		
		MyComparator c = new MyComparator(); 
		Collections.sort(list,c);
		
		System.out.printf("%15s%15s%20s\n","[파일명]","[크기]","[파일이 들어있는 폴더]");
		for(File item : list) {
			System.out.println(item.getParent());
			String parent =item.getParent();
			int idx = parent.lastIndexOf("\\");
			
//			System.out.println();
			
			String tmp = "";
			System.out.println(item.getName()+"\t\t\t"+item.length()+"\t\t\t"+parent.substring(idx+1));
		}
		
		
	}

	private static void searchFile(File dir, ArrayList<File> list) {
		File[] files = dir.listFiles();
		for(File file : files) {
			if(file.isFile()) {
//				System.out.println(file.getName());
				list.add(file);
			}
			else {
				searchFile(file,list);
			}
		}
	}

}

class MyComparator implements Comparator<File>{

	@Override
	public int compare(File o1, File o2) {
		return (int)o1.length() - (int)o2.length();
	}
}

