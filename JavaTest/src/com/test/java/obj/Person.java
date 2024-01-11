package com.test.java.obj;

import java.util.Arrays;

public class Person {
	
	private String name;
	private int age;
	private String address;
	private String[] nick = new String[3]; // 별명
	private int index = 0;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void addNick(String nick) {
		this.nick[index++] = nick;
	}
	
	public String getNick(int index) {
		return nick[index];
	}
	
	
	public String info() {
		String temp = "";
		temp += "이름: " + name + "\r\n";
		temp += "나이: " + age + "\r\n";
		temp += "주소: " + address + "\r\n";
		temp += "별명: " + Arrays.toString(nick) + "\r\n";
		return temp;
	}
	
}
