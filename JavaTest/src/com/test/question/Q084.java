package com.test.question;

public class Q084 {
	public static void main(String[] args) {
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		int num = 0;
		int idx = 0;
		while(true) {
			idx = content.indexOf(word, idx);
			if(idx == -1)
				break;
			idx++;
			num++;
		}
		System.out.println(word + "를 총 "+num+"회 발견했습니다.");
	}
}
