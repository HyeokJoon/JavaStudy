package com.test.java.obj;

import java.util.Arrays;

public class MyArrayList {
	private String[] list;
	private int index;
	
	
	public MyArrayList() {
		this(4);
	}
	
	
	public MyArrayList(int capacity) {
		this.list = new String[capacity];
		this.index = 0;
	}


	public boolean add(String value) {
		if(checkLength()) {
			doubleList();
		}
		
		this.list[this.index]= value;
		this.index++;
		
		return true;
	}

	public boolean add(int index, String value) {
		if(checkLength()) {
			doubleList();
		}
		shiftRight(index);
		this.list[index] = value;
		this.index++;
		return true;
	}

	private void shiftRight(int index) {
		for(int i=this.index; i>index; i--)
			this.list[i] = this.list[i-1];
	}


	private void doubleList() {
		//기존 배열 > (복사 + 교체) > 새로운 배열
		String[] temp = new String[this.list.length * 2];
		
		//깊은 복사
		for(int i=0; i<list.length; i++) {
			temp[i] = this.list[i];
		}
		
		//교체
		this.list = temp;
	}


	private boolean checkLength() {
		if(this.list.length == this.index)
			return true;
		return false;
	}


	public String get(int index) {
		if(!checkIndex(index)) {
			//강제 에러 발생
			throw new IndexOutOfBoundsException();
		}
		
		return this.list[index];
	}

	private boolean checkIndex(int index) {
		//사용가능한 방번호?
		return (index>=0 && index<this.index);
	}


	public int size() {
		return index;
	}

	public String set(int index, String value) {
		if(!checkIndex(index)) {
			//강제 에러 발생
			throw new IndexOutOfBoundsException();
		}
		String old = this.list[index];
		this.list[index] = value;
		return old;
	}

	public String remove(int index) {
		String old = this.list[index];
		shiftList(index);
		return old;
	}

	private void shiftList(int index) {
		for(int i= index; i<this.list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		this.list[this.index-1] = null;
		this.index--;
	}


	public int indexOf(String string) {
		for(int i=0; i<this.index; i++) {
			if(this.list[i].equals(string))
				return i;
		}
		return -1;
	}
	
	public void clear() {
		this.list = new String[4];
		this.index = 0;
	}
	@Override
	public String toString() {
		String tmp = "";
		tmp += String.format("length: %d\r\n", this.list.length);
		tmp += String.format("index: %d\r\n", this.index);
		tmp += "[\r\n";
		for(int i=0; i<list.length; i++) {
			tmp += String.format("   %d: %s\r\n", i, this.list[i]);
		}
		tmp += "]\r\n";
		return tmp;
	}


	public void trimToSize() {
		
		String[] temp = new String[this.index];
		
		for(int i=0; i<this.index; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
		
		
	}
	
}
