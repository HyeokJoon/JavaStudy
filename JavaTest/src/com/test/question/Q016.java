package com.test.question;

public class Q016 {
	public static void main(String[] args) {
		
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);
	}

	private static void sum(int i, int j, int k, int l, int m) {
		System.out.println(i+" + "+j+" + "+k+" + "+l+" + "+m+" = " + (i+j+k+l+m));		
	}

	private static void sum(int i, int j, int k, int l) {
		System.out.println(i+" + "+j+" + "+k+" + "+l+" = " + (i+j+k+l));
	}

	private static void sum(int i, int j, int k) {
		System.out.println(i+" + "+j+" + "+k+ " = " + (i+j+k));
	}

	private static void sum(int i, int j) {
		System.out.println(i+" + "+j +" = " + (i+j));
	}

	private static void sum(int i) {
		System.out.println(i + " = "+ i);
		
	}
}
