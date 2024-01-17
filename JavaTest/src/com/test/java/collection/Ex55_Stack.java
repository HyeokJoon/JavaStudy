package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex55_Stack {
	public static void main(String[] args) {
//		m1();
//		m2();
//		m3();
		m4();
	}

	private static void m4() {
		//배열 생성
		MyStack stack = new MyStack();

		//추가
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("검정");

		//읽기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		//개수
		System.out.println(stack.size());

		//확인
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());

		//크기 조절
		stack.trimToSize();

		//초기화
		stack.clear();
		System.out.println(stack.size());
		
	}

	private static void m3() {
		MyQueue queue = new MyQueue();
		
		System.out.println(queue);
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		queue.add("주황");
		queue.add("검정");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.size());
		
		System.out.println(queue.peek());
		
		queue.clear();
		System.out.println(queue.size());
		
	}

	private static void m2() {

		Queue<String> queue = new LinkedList<String>();
		
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		
//		System.out.println(queue.size());
//		
//		System.out.println(queue.poll());
//		System.out.println(queue.size());
//
//		System.out.println(queue.poll());
//		System.out.println(queue.size());
//		
//		System.out.println(queue.poll());
//		System.out.println(queue.size());
		
		queue.peek();
		
	}

	private static void m1() {
		Stack<String> stack = new Stack<String>();
		
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		
		System.out.println(stack);
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
	}
}
