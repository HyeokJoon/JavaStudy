package com.test.java.bbb;

import com.test.java.aaa.Red;

public class Yellow {
	public void test() {
		Red r1 = new Red();
		r1.a = 10;
		//r1.b = 20;
		//r1.c = 30; //***default는 다른 패키지에서는 비공개
		//r1.d = 40;
	}
}
