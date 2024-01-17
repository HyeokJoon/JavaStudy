package com.test.question;

public class Q106 {
	public static void main(String[] args) {
		//배열 생성
		MyHashMap map = new MyHashMap();

		//추가
		map.put("국어", "합격");
		map.put("영어", "불합격");
		map.put("수학", "보류");

		//읽기
		System.out.println(map.get("국어"));
		System.out.println(map.get("영어"));
		System.out.println(map.get("수학"));

		//개수
		System.out.println(map.size());

		//수정
		map.put("영어", "합격");
		System.out.println(map.get("영어"));
		//삭제
		map.remove("영어");
		System.out.println(map.get("영어"));

		//검색(key)
		if (map.containsKey("국어")) {
		      System.out.println("국어 점수 있음");
		} else {
		      System.out.println("국어 점수 없음");
		}

		//검색(value)
		if (map.containsValue("합격")) {
		      System.out.println("합격 과목 있음");
		} else {
		      System.out.println("합격 과목 없음");
		}

		//초기화
		map.clear();
		System.out.println(map.size());
	}
}


class MyHashMap{
	private String[] keys;
	private String[] values;
	private int index;
	
	public MyHashMap() {
		this.index = 0;
		this.keys = new String[4];
		this.values = new String[4];		
	}
	
	public String put(String key, String value) {
		int i = findIndex(key);
		String tmp = null;
		if(i>=0) {
			tmp = values[i];
			values[i] = value;
		}
		else {
			if(checkLength()) {
				doubleList();
			}
			keys[this.index] = key;
			values[this.index] = value;
			this.index++;
		}
		return tmp;
	}
	private void doubleList() {
		String[] tempKey = new String[this.index * 2];
		String[] tempValue = new String[this.index * 2];
		for(int i=0; i<this.index; i++) {
			tempKey[i] = this.keys[i];
			tempValue[i] = this.values[i];
		}
		this.keys = tempKey;
		this.values = tempValue;
	}

	private boolean checkLength() {
		if(this.keys.length == this.index)
			return true;
		return false;
	}
	
	public String get(String key) {
		int i = findIndex(key);
		if(i>=0) {
			return values[i];
		}
		else {
			return null;
		}
	}

	private int findIndex(String key) {
		for(int i=0; i<this.index; i++) {
			if(keys[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
	public int size() {
		return index;
	}
	
	public String remove(String key) {
		String tmp = null;
		int i = findIndex(key);
		if(i>=0) {
			tmp = values[i];
			shiftList(i);
		}
		return tmp;
	}

	private void shiftList(int startIndex) {
		for(int i=startIndex; i<this.index-1; i++) {
			keys[i] = keys[i+1];
			values[i] = values[i+1];
		}
		this.index--;
	}
	
	public boolean containsKey(String key) {
		int i = findIndex(key);
		if(i>=0)
			return true;
		return false;
	}
	
	public boolean containsValue(String value) {
		for(int i=0; i<this.index; i++) {
			if(values[i].equals(value))
				return true;
		}
		return false;
	}
	
	public void clear() {
		this.index = 0;
	}
	
	public void trimToSize() {
		String[] tempKey = new String[this.index];
		String[] tempValue = new String[this.index];
		for(int i=0; i<this.index; i++) {
			tempKey[i] = this.keys[i];
			tempValue[i] = this.values[i];
		}
		this.keys = tempKey;
		this.values = tempValue;
	}
	
	@Override
	public String toString() {
		String tmp = "";
		tmp += String.format("length: %d\r\n", this.keys.length);
		tmp += String.format("index: %d\r\n", this.index);
		tmp += "[\r\n";
		for(int i=0; i<keys.length; i++) {
			tmp += String.format("   %d > key: %s  value: %s \r\n", i, this.keys[i], this.values[i]);
		}
		tmp += "]\r\n";
		return tmp;
	}
}
