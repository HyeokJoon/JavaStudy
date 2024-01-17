package com.test.java.collection;

public class MyQueue {
	
	private String[] list;
	private int index;
	
	public MyQueue() {
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

	public boolean add(String string) {
		
		if(checkLength()) {
			doubleList();
		}
		this.list[this.index] = string;
		this.index++;
		
		return true;
		
		
	}

	private void doubleList() {
		String[] temp = new String[this.list.length * 2];
		for(int i=0; i<this.index; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
	}

	private boolean checkLength() {
		if(this.list.length == this.index)
			return true;
		return false;
	}
	
	public String poll() {
		if(this.index == 0) {
			//강제 에러 발생
			throw new IndexOutOfBoundsException();
		}
		String item = this.list[0];
		
		for(int i=0; i<this.list.length-1; i++) {
			this.list[i] = list[i+1];
		}
		this.index--;
		
		return item;
	}

	public int size() {
		
		return this.index;
	}

	public String peek() {
		if(this.index == 0) {
			//강제 에러 발생
			throw new IndexOutOfBoundsException();
		}
		return this.list[0];
	}

	public void clear() {
		while(this.size() > 0) {
			this.poll();
		}
	}
	
}
