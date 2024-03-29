package com.test.question;

public class Q018 {
	public static void main(String[] args) {
		int count;
		count = positive(10);
		System.out.printf("양수: %d개\n",count);
		count = positive(10, 20);
		System.out.printf("양수: %d개\n",count);
		count = positive(10, 20, -30);
		System.out.printf("양수: %d개\n",count);
		count = positive(10, 20, -30, 40);
		System.out.printf("양수: %d개\n",count);
		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수: %d개\n",count);
	}

	private static int positive(int i, int j, int k, int l, int m) {
		return i>0 ? positive(j,k,l,m)+1 : positive(j,k,l,m);
	}

	private static int positive(int i, int j, int k, int l) {
		return i>0 ? positive(j,k,l)+1 : positive(j,k,l);
	}

	private static int positive(int i, int j, int k) {
		return i>0 ? positive(j,k)+1 : positive(j,k);
	}

	private static int positive(int i, int j) {
		return i>0 ? positive(j)+1 : positive(j);
	}

	private static int positive(int i) {
		return i>0 ? 1 : 0;
	}
}
