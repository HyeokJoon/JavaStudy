package com.test.java.collection;

public class MyStack {
	private String[] list;
	private int index;
	
	public MyStack() {
		super();
		this.list = new String[4];
		this.index = 0;
	}
	
	public boolean push(String value) {
		if(checkLength()) {
			doubleList();
		}
		this.list[this.index++] = value;
		return true;
	}

	private void doubleList() {
		String[] tmp = new String[this.index * 2];
		for(int i=0; i<this.index; i++) {
			tmp[i] = this.list[i];
		}
		
		this.list = tmp;
	}

	private boolean checkLength() {
		return (this.list.length == this.index);
	}
	
	public String pop() {
		if(this.index == 0) {
			throw new IndexOutOfBoundsException();
		}
		String tmp = this.list[this.index-1];
		this.index--;
		return tmp;
	}
	
	public int size() {
		return this.index;
	}
	
	public String peek() {
		if(this.index == 0) {
			throw new IndexOutOfBoundsException();
		}
		return this.list[this.index-1];
	}
	
	public void clear() {
		while(this.size()>0) {
			this.pop();
		}
	}
	
	public void trimToSize() {
		String[] tmp = new String[this.index];
		for(int i=0; i<this.index; i++) {
			tmp[i] = this.list[i];
		}
		this.list = tmp;
	}
}
