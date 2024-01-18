package com.test.question;

public class Q108 {
	public static void main(String[] args) {
		//배열 생성
		MySet list = new MySet();

		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");

		//개수
		System.out.println(list.size());

		//삭제
		list.remove("아무개");

		//개수
		System.out.println(list.size());

		//탐색 + 읽기
		while (list.hasNext()) {
		      System.out.println(list.next());
		}

		//초기화
		list.clear();
		System.out.println(list.size());
	}
}

class MySet{
	private String[] list;
	private int index;
	private int iter;
	
	public MySet() {
		this.list = new String[4];
		this.index = 0;
		this.iter = 0;
	}
	
	public boolean add(String value) {
		if(findIndex(value)>=0) {
			return false;
		}
		if(checkLength()) {
			doubleList();
		}
		this.list[this.index] = value;
		this.index++;
		return true;
	}
	
	private int findIndex(String value) {
		for(int i=0; i<this.index; i++) {
			if(this.list[i].equals(value))
				return i;
		}
		return -1;
	}

	int size() {
		return index;
	}
	
	public boolean remove(String value) {
		int i = findIndex(value);
		if(i<0)
			return false;
		for(; i<this.index-1; i++) {
			list[i] = list[i+1];
		}
		this.index--;
		return true;
	}
	
	public void clear() {
		this.index = 0;
		this.iter = 0;
	}
	
	public boolean hasNext() {
		return this.index >= iter+1;
	}
	
	public String next() {
		return list[iter++];
	}
	
	private boolean checkLength() {
		return (this.index == this.list.length);
	}

	private void doubleList() {
		
		String[] tmp = new String[this.index * 2];
		for(int i=0; i<this.index; i++) {
			tmp[i] = this.list[i];
		}
		this.list = tmp;
		
	}
}
