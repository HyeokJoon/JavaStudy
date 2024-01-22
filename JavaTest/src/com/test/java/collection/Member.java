package com.test.java.collection;

import java.util.Objects;

public class Member {
	private String name;
	private int age;
	
	public Member(String name,int age) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return String.format("%s(%d)", this.name, this.age);
	}
	
	@Override
	public int hashCode() {
		
		System.out.println((this.name + this.age).hashCode());
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
